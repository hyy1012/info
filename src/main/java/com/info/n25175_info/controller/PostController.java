package com.info.n25175_info.controller;

import com.alibaba.fastjson.JSONObject;
import com.info.n25175_info.dto.PostDto;
import com.info.n25175_info.entity.N25175Post;
import com.info.n25175_info.entity.N25175Text;
import com.info.n25175_info.service.ExcelService;
import com.info.n25175_info.service.PostService;
import com.info.n25175_info.service.TestExcelService;
import com.info.n25175_info.service.TextService;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Class Name:com.info.n25175_info.controller PostController
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/18 0018 16:37
 * Description: PostController 应聘岗位和题目
 * ==========================
 */
@RequestMapping("/post")
@Controller
public class PostController {


    private Logger logger = LoggerFactory .getLogger(PostController.class);

    @Autowired
    private PostService postService;

    @Autowired
    private TestExcelService excelService;

    @Autowired
    private TextService textService;

    /**
     * 跳转到岗位页面
     * @return
     */
    @RequestMapping("/toPost")
    public String toPost(){
        return "home/post";
    }

    /**
     * 跳转到岗位页面
     * @return
     */
    @RequestMapping("/toText")
    public String toText(ModelMap modelMap){
        /*List<N25175Text> n25175Texts = textService.findAll();
        modelMap.addAttribute("test", n25175Texts);*/
        return "home/text";
    }

    /**
     * 添加岗位
     * @param post
     * @return
     */
    @RequestMapping("/add")
    @ResponseBody
    public JSONObject add(N25175Post post){
        JSONObject jsonObject = new JSONObject();
        boolean b = postService.addPost(post);
        if (b){
            jsonObject.put("code",200);
        }else{
            jsonObject.put("code",201);
        }
        return jsonObject;
    }


    /**
     * 编辑岗位
     * @param post
     * @return
     */
    @RequestMapping("/edit")
    @ResponseBody
    public JSONObject edit(  N25175Post post){
        JSONObject jsonObject = new JSONObject();
        boolean b = postService.editPost(post);
        if (b){
            jsonObject.put("code",200);
        }else{
            jsonObject.put("code",201);
        }
        return jsonObject;
    }


    /**
     * 删除岗位
     */
    @RequestMapping("/delete")
    @ResponseBody
    public JSONObject delete(Integer id){
        JSONObject jsonObject = new JSONObject();
        boolean delete = postService.delete(id);
        if (delete){
            jsonObject.put("code",200);
        }else{
            jsonObject.put("code",201);
        }
        return jsonObject;
    }


    /**
     * 获得所有岗位
     */
    @RequestMapping("/getAllPost")
    @ResponseBody
    public JSONObject getAll(){
        JSONObject jsonObject = new JSONObject();
        List<N25175Post> allPost = postService.getAllPost();
        List<PostDto> all = new ArrayList<>();
        for (N25175Post post : allPost){
            List<N25175Text> texts = textService.findByPid(post.getNpId());
            PostDto postDto = new PostDto();
            postDto.setNpSign(post.getNpSign());
            postDto.setNpId(post.getNpId());
            postDto.setNpName(post.getNpName());
            postDto.setTexts(texts);
            all.add(postDto);
        }
        jsonObject.put("code",0);
        jsonObject.put("count",allPost.size());
        jsonObject.put("msg","");
        jsonObject.put("data",all);
        return jsonObject;
    }

    /**
     * 导出试题
     */
    @RequestMapping(value = "/exportExcelSel", produces = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")
    @ResponseBody
    public byte[] exportExcel(@RequestParam("ids") List<Integer> ids, HttpServletResponse response) throws IOException {
        String name = new String("25175_试题".getBytes(),"iso-8859-1") +".xlsx";
        response.setHeader("Content-Disposition", "attachment; filename=" + name);
        XSSFWorkbook workbook = excelService.createExcel(ids);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        // 将Excel写到流中
        workbook.write(out);
        workbook.close();
        out.close();
        // 从流中获取全部Excel的数据
        byte[] bytes = out.toByteArray();
        return bytes;
    }

    /**
     * 导入试题
     */
    @RequestMapping(value = "/importExcel",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject importExcel(MultipartFile file){
        JSONObject jsonObject = new JSONObject();
        InputStream input = null;
        try {
            input = file.getInputStream();
            Workbook wb = WorkbookFactory.create(input);
            for (int i = 0; i < wb.getNumberOfSheets(); i++) {
                Sheet sheet = wb.getSheetAt(i);
                excelService.parseExcel(sheet);
            }
            jsonObject.put("code", 200);
            jsonObject.put("msg", "导入成功");
        } catch (IOException e) {
            e.printStackTrace();
            jsonObject.put("code", 201);
            jsonObject.put("msg", "导入失败, 文件传输错误");
        } catch (RuntimeException e) {
            e.printStackTrace();
            jsonObject.put("code", 201);
            jsonObject.put("msg", e.getMessage());
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } finally {
            try {
                if (input != null)
                    input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return jsonObject;
    }

}
