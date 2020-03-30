package com.info.n25175_info.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.info.n25175_info.entity.N25175Admin;
import com.info.n25175_info.entity.N25175Post;
import com.info.n25175_info.entity.N25175User;
import com.info.n25175_info.entity.N25175UserEnable;
import com.info.n25175_info.service.AdminService;
import com.info.n25175_info.service.ExcelService;
import com.info.n25175_info.service.PostService;
import com.info.n25175_info.service.UserService;
import com.info.n25175_info.utils.ExportWord;
import com.info.n25175_info.utils.FileUtil;
import freemarker.core.ParseException;
import freemarker.log.Logger;
import freemarker.template.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.tools.zip.ZipOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Class Name: com.info.n25175_info.controller.UserController
 * ==================================
 * Author c25175 黄凯
 * Date 2019/12/1615:12
 * Description: UserController
 * ==================================
 */
@Controller
@RequestMapping("/home")
public class UserController {

    @Resource
    private AdminService adminService;

    @Resource
    private UserService userService;

    @Autowired
    private PostService postService;

    @Autowired
    private ExcelService excelService;

    @Autowired
    private ExportWord exportWord;

    private static final String BASE_PATH = System.getProperty("java.io.tmpdir") + "Resource" + File.separator;

    @RequestMapping("/console")
    public String toIndex(Integer uAid, ModelMap modelMap){
        List<N25175Post> n25175Posts = postService.getAllActivePost();
        System.out.println(uAid);
        modelMap.addAttribute("d", uAid);
        modelMap.addAttribute("posts", n25175Posts);
        return "home/console";
    }

    @RequestMapping("/consoleDef")
    public String toConsoleDef(){
        return "home/consoleDef";
    }

    @PostMapping("/add")
    public JSONObject add(N25175User n25175User){
        return userService.add(n25175User);
    }


    @PostMapping(value = "/handle_edit_profile")
    @ResponseBody
    public JSONObject handleEditProfile(N25175User n25175User, HttpSession session) {
        System.out.println(n25175User);
        return userService.editProfile(n25175User, session);
    }

    @PostMapping(value = "/show_profile")
    @ResponseBody
    public JSONObject showProfile(Integer uAid, HttpSession session) {
        JSONObject jsonObject = new JSONObject();
        N25175Admin user = (N25175Admin)session.getAttribute("user");
        if (uAid==0){ //不是从管理页面跳过来的
            if(user.getaRole()==0){
                jsonObject.put("code", 300); //管理员直接进入时不需要修改按钮
                return jsonObject;
            }else if (user.getaEdit()!=1){
                jsonObject = userService.showProfile(user.getaId());
                jsonObject.put("hide", 1); //用户不是第一次编辑,隐藏修改按钮
                jsonObject.put("close", 1);
                return jsonObject;
            }else {
                jsonObject = userService.showProfile(user.getaId());
                jsonObject.put("uAid", user.getaId());
                jsonObject.put("close", 1);
                return jsonObject;
            }
        }else {
            return userService.showProfile(uAid);
        }
    }

    @PostMapping(value = "/edit_def")
    @ResponseBody
    public JSONObject handleEditDef(N25175UserEnable n25175UserEnable) {
        handleLayuiBug(n25175UserEnable);
        return userService.editDef(n25175UserEnable);
    }

    @GetMapping(value = "/show_def")
    @ResponseBody
    public JSONObject showDef() {
        return userService.showDef();
    }

    @GetMapping(value = "/allschools")
    @ResponseBody
    public List<String> getAllSchools() {
        return userService.findAllSchools();
    }

    @GetMapping(value = "/tensl")
    @ResponseBody
    public List<String> getTenSchools(String name) {
        PageHelper.startPage(0,10);
        List<String> schools =  userService.findSchools(name);
        return schools;
    }

//    @GetMapping(value = "/schools")
//    @ResponseBody
//    public List<String> getSchools(String name) {
//        return userService.findSchools(name);
//    }

    @PostMapping(value = "/upload-image")
    @ResponseBody
    public JSONObject showDef(MultipartFile image, Integer uAid, HttpServletRequest request) {
        JSONObject jsonObject = new JSONObject();
        String path = "/photos";
        path = request.getServletContext().getRealPath(path);
        File dir = new File(path);
        dir.mkdir();
        String[] photonames = image.getOriginalFilename().split("\\.");
        String photoname = uAid + "." + photonames[1];
        try {
            image.transferTo(new File(dir, photoname));
            userService.insertPhoto(uAid, photoname);
            jsonObject.put("code",200);
        } catch (IOException e) {
            jsonObject.put("code",201);
            jsonObject.put("msg","修改失败"+e);
        }
        return jsonObject;
    }

    /**
     * 复选框勾选了有时候会传一个""
     * @param n25175UserEnable
     */
    private void handleLayuiBug(N25175UserEnable n25175UserEnable){
        if ("".equals(n25175UserEnable.geteIdef1()) || "off".equals(n25175UserEnable.geteIdef1())){
            n25175UserEnable.seteIdef1("on");
        }
        if ("".equals(n25175UserEnable.geteIdef2()) || "off".equals(n25175UserEnable.geteIdef2())){
            n25175UserEnable.seteIdef2("on");
        }
        if ("".equals(n25175UserEnable.geteDdef1()) || "off".equals(n25175UserEnable.geteDdef1())){
            n25175UserEnable.seteDdef1("on");
        }
        if ("".equals(n25175UserEnable.geteDdef2()) || "off".equals(n25175UserEnable.geteDdef2())){
            n25175UserEnable.seteDdef2("on");
        }
        if ("".equals(n25175UserEnable.geteSdef1()) || "off".equals(n25175UserEnable.geteSdef1())){
            n25175UserEnable.seteSdef1("on");
        }
        if ("".equals(n25175UserEnable.geteSdef2()) || "off".equals(n25175UserEnable.geteSdef2())){
            n25175UserEnable.seteSdef2("on");
        }
        if ("".equals(n25175UserEnable.geteTadef1()) || "off".equals(n25175UserEnable.geteTadef1())){
            n25175UserEnable.seteTadef1("on");
        }
        if ("".equals(n25175UserEnable.geteTadef2()) || "off".equals(n25175UserEnable.geteTadef2())){
            n25175UserEnable.seteTadef2("on");
        }
    }

    /**
	 * Excel 导出(下载)功能
	 *
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/exportExcel", produces = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")
	@ResponseBody
	public byte[] exportExcel(Integer id, HttpServletResponse response) throws IOException {
		response.setHeader("Content-Disposition", "attachment; filename=\"25175_档案.xlsx\"");
		byte[] bytes = createExcel(id);
		return bytes;
	}

    @RequestMapping(value = "/exportExcelSel", produces = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")
    @ResponseBody
    public byte[] exportExcel(@RequestParam("ids") List<Integer> ids, HttpServletResponse response) throws IOException {
        response.setHeader("Content-Disposition", "attachment; filename=\"25175_档案.xlsx\"");
        byte[] bytes = createExcel(ids);
        return bytes;
    }

    @RequestMapping(value = "/exportExcelAll", produces = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")
    @ResponseBody
    public byte[] exportExcelauto(Integer zhiwei, HttpServletResponse response) throws IOException {
        response.setHeader("Content-Disposition", "attachment; filename=\"25175_档案.xlsx\"");
        byte[] bytes = createExcel(zhiwei);
        return bytes;
    }

    /**
     * Word 导出(下载)功能
     *
     * @param response
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/exportWord", produces = "application/vnd.openxmlformats-officedocument.wordprocessingml.document")
    @ResponseBody
    public void exportWord(Integer id, HttpServletResponse response, HttpServletRequest request) throws IOException {
        String name = new String("25175_个人档案".getBytes(),"iso-8859-1") +".docx";
        response.setHeader("Content-Disposition", "attachment; filename="+name);
        response.setContentType("application/force-download");
        ServletOutputStream outputStream=response.getOutputStream();
        byte[] bytes = createWord(id, request.getServletContext());
        outputStream.write(bytes);
        outputStream.close();
    }

    @RequestMapping(value = "/exportWordAll", produces = "application/vnd.openxmlformats-officedocument.wordprocessingml.document")
    @ResponseBody
    public void exportWordAll(@RequestParam("ids") List<Integer> ids, HttpServletResponse response, HttpServletRequest request) throws IOException {
        ZipOutputStream out = null;
        BufferedInputStream bis =  null;
        InputStream in = null;
        String tip = UUID.randomUUID().toString() + File.separator;
        try {
            exportWord.createAllWorkbooks(tip, ids, request.getServletContext());
            response.setHeader("content-type", "application/octet-stream");
            response.setContentType("application/octet-stream;charset=utf-8");
            response.setHeader("Content-Disposition", "attachment;filename=" + "Word.zip");
            System.out.println(BASE_PATH + tip);
            File tempZip = new File(BASE_PATH + tip + "temp.zip");
            FileUtil.createZipFile(new File(BASE_PATH + tip), new ZipOutputStream(tempZip));
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

    private byte[] createWord(Integer id, ServletContext context) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        exportWord.createWordMain(id, out, context);
        out.close();
        // 从流中获取全部Excel的数据
        byte[] bytes = out.toByteArray();
        return bytes;
    }

	private byte[] createExcel(Integer aStatus) throws IOException {
//        N25175User n25175User = userService.findByuAid(id);
//        XSSFWorkbook workbook = excelService.createExcel(n25175User, id);
//
//		ByteArrayOutputStream out = new ByteArrayOutputStream();
//		// 将Excel写到流中
//		workbook.write(out);
//		workbook.close();
//		out.close();
//		// 从流中获取全部Excel的数据
//		byte[] bytes = out.toByteArray();
//		return bytes;
        List<Integer> ids = adminService.findAIdsByAStauts(aStatus);
        return createExcel(ids);
	}

    private byte[] createExcel(List<Integer> ids) throws IOException {
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


}
