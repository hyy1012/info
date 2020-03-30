package com.info.n25175_info.controller;

import com.alibaba.fastjson.JSONObject;
import com.info.n25175_info.dto.UserExcelDto;
import com.info.n25175_info.entity.N25175Admin;
import com.info.n25175_info.entity.N25175User;
import com.info.n25175_info.service.AdminService;
import com.info.n25175_info.service.ExcelService;
import com.info.n25175_info.service.PostService;
import com.info.n25175_info.service.UserService;
import com.info.n25175_info.utils.FileUtil;
import com.info.n25175_info.utils.Mobile;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.tools.zip.ZipOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;


/**
 * Class Name: com.info.n25175_info.controller.UserExcelController
 * ==================================
 * Author c25175 黄凯
 * Date 2019/12/2411:32@Autowired
 *     private AdminService adminService;
 * Description: UserExcelController
 * ==================================
 */
@Controller
@RequestMapping("/excel")
@Slf4j
public class UserExcelController {

    @Autowired
    private ExcelService excelService;

    private List<String> phones = null;

    public static final String DATE_FULL_STR = "yyyy-MM-dd";
    private static final String OFFICE_EXCEL_XLS = ".xls";
    private static final String OFFICE_EXCEL_XLSX = ".xlsx";
    static final String NUMBER_REG = "^\\d*(\\.\\d*|)$";



    private static final String BASE_PATH = System.getProperty("java.io.tmpdir") + "Resource" + File.separator;

    @RequestMapping(value = "/export",method = RequestMethod.GET)
    public void export(HttpServletRequest request, HttpServletResponse response) {
        ZipOutputStream out = null;
        BufferedInputStream bis =  null;
        InputStream in = null;
        String tip = UUID.randomUUID().toString() + File.separator;
        try {
            createAllWorkbooks(tip);
            response.setHeader("content-type", "application/octet-stream");
            response.setContentType("application/octet-stream;charset=utf-8");
            response.setHeader("Content-Disposition", "attachment;filename=" + "EXCEL.zip");
            System.out.println(BASE_PATH + tip);
            File tempZip = new File(BASE_PATH + tip + "temp.zip");
            FileUtil.createZipFile(new File(BASE_PATH+ tip), new ZipOutputStream(tempZip));
            System.out.println("Created ZIP File");
            OutputStream os = response.getOutputStream();
            in = new FileInputStream(tempZip);
            bis = new BufferedInputStream(in);
            byte buff[] = new byte[1024];
            int i = bis.read(buff);
            while (i != -1) {
                os.write(buff, 0, buff.length);
                os.flush();
                i = bis.read(buff);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            FileUtil.deleteDir(BASE_PATH);
        }
    }

    @RequestMapping(value = "/importExcel",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject importExcel(@RequestParam(value = "files") MultipartFile[] files, HttpServletRequest request){
        phones = new ArrayList<>();
        JSONObject jsonObject = new JSONObject();
        if (files.length==0){
            jsonObject.put("code", 202);
            jsonObject.put("msg", "请选择文件");
            return jsonObject;
        }
        try {
            for (MultipartFile file : files) {
                parseExcel(file, phones);
            }
            jsonObject.put("code", 200);
            if (phones.size()>0){
                StringBuffer sb = new StringBuffer();
                for (String str : phones){
                    sb.append(str);
                }
                jsonObject.put("msg", "导入成功,其中:\n"+sb);
            }else{
                jsonObject.put("msg", "导入成功");
            }
            return jsonObject;
        } catch (Exception e) {
            jsonObject.put("code", 201);
            jsonObject.put("msg", e.getMessage());
            e.printStackTrace();
            return jsonObject;
        }
    }

    @RequestMapping(value = "/exportExcel", produces = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")
    @ResponseBody
    public byte[] exportExcel(Integer id,HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = new String("25175_模板".getBytes(),"iso-8859-1") +".xlsx";
        response.setHeader("Content-Disposition", "attachment; filename=" + name);
        response.setContentType("application/vnd.ms-excel");
        File model = new File(request.getServletContext().getRealPath("template")+"/model.xlsx");
        FileInputStream fis = new FileInputStream(model);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] b = new byte[1024];
        int n;
        while ((n = fis.read(b)) != -1) {
            bos.write(b, 0, n);
        }
        fis.close();
        bos.close();
        byte[] bytes = bos.toByteArray();
        return bytes;
    }

    /**
     * create mock data
     *
     * */
    public List<Workbook> createAllWorkbooks(String tip) {
        List<Workbook> workbooks = new ArrayList<>();
        OutputStream out = null;
        try {
            for (int i=0;i<100;i++) {
                File tempFile = new File(BASE_PATH + tip + i + ".xlsx");
                tempFile.getParentFile().mkdirs();
                tempFile.createNewFile();
                out = new FileOutputStream(tempFile);
                Workbook workbook = new XSSFWorkbook();
                workbook.createSheet("summary");
                workbook.getSheetAt(0).createRow(0);
                Row row = workbook.getSheetAt(0).getRow(0);
                Cell cell = row.createCell(0);
                cell.setCellValue("Hello Spring Boot.");
                workbooks.add(workbook);
                workbook.write(out);
                out.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out!= null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return workbooks;
    }

    public void parseExcel(MultipartFile file, List<String> phones) throws Exception {
        if (file == null || file.isEmpty()){
            throw new Exception("file is null");
        }
        if (file.getOriginalFilename().endsWith(OFFICE_EXCEL_XLS)){
            excelService.parseXLS(file, phones);
        }  else if (file.getOriginalFilename().endsWith(OFFICE_EXCEL_XLSX)){
            excelService.parseXLSX(file, phones);
        }  else {
            throw new Exception("file does not support:" + file.getOriginalFilename());
        }
    }




}
