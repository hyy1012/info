package com.info.n25175_info.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.info.n25175_info.dao.N25175PostMapper;
import com.info.n25175_info.entity.N25175Admin;
import com.info.n25175_info.entity.N25175Organ;
import com.info.n25175_info.entity.N25175Post;
import com.info.n25175_info.entity.N25175PostExample;
import com.info.n25175_info.service.AdminService;
import com.info.n25175_info.service.DepartmentService;
import freemarker.template.SimpleDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Class Name:com.info.n25175_info.controller InnerInfoController
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/17 0017 9:41
 * Description: InnerInfoController
 * ==========================
 */
@Controller
@RequestMapping(value = "/inner")
public class InnerInfoController {


    private Logger logger = LoggerFactory.getLogger(OuterInfoController.class);

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private N25175PostMapper n25175PostMapper ;

    @Autowired
    private AdminService adminService;

    //跳转到应聘人员页面
    @RequestMapping(value = "/toInner")
    public String toOuter(){
        return "user/innerInfo";
    }

    /**
     * 修改用户信息
     * s1是初始职务,p1,p2是岗位,因为不在一张表,所以要传两个,o1是初始部门
     * @param admin
     * @return
     */
    @RequestMapping(value = "/edit")
    @ResponseBody
    public JSONObject edit(N25175Admin admin, String name, Integer s1, Integer p1, Integer p2, Integer o1){
        JSONObject jsonObject = new JSONObject();
        boolean b = adminService.editAdmin(admin, name, s1, p1, p2, o1);
        if (b){
            jsonObject.put("code",200);
        }else {
            jsonObject.put("code",201);
        }
        return jsonObject;
    }


    /**
     * 根据条件分页查询
     * @param page 当前页
     * @param limit 限制数
     * @param name 名字
     * @param request
     * @return
     */
    @RequestMapping("/getInner")
    @ResponseBody
    public JSONObject getInner(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10")Integer limit, String field, String order, Integer status,String name, HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        PageHelper.startPage(page,limit);
        List<N25175Admin> n25175Admins = adminService.selectByStatus(status,null, name, request, field, order);
        PageInfo info = new PageInfo(n25175Admins);
        jsonObject.put("code",0);
        jsonObject.put("count",info.getTotal());
        jsonObject.put("msg","");
        jsonObject.put("data",n25175Admins);

        return jsonObject;
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @RequestMapping("/delete")
    @ResponseBody
    public JSONObject delete(Integer id){
        JSONObject jsonObject = new JSONObject();
        boolean b = adminService.deleteAdmin(id);
        if (b){
            jsonObject.put("code",200);
        }else{
            jsonObject.put("code",201);
        }
        return jsonObject;
    }

    @RequestMapping("/deleteMany")
    @ResponseBody
    public JSONObject deMany(Integer[] ids){
        JSONObject jsonObject = new JSONObject();
        int i=0;
        for (Integer id:ids){
            boolean b = adminService.deleteAdmin(id);
            if (!b){
             i++;
            }
        }
        if (i==0){
            jsonObject.put("code",200);
        }else{
            jsonObject.put("code",201);
        }
        return jsonObject;
    }

    /**
     * 添加用户
     */
    @RequestMapping("/add")
    @ResponseBody
    public JSONObject addAdmin(N25175Admin admin,String phone,Integer sex,String name,Integer post){
        JSONObject jsonObject = new JSONObject();
        boolean b = adminService.addAdmin(admin, phone, sex, name, post);
        if (b){
            jsonObject.put("code",200);
        }else{
            jsonObject.put("code",201);
        }
        return jsonObject;
    }


    /**
     * 获取职位集合
     */
    @RequestMapping("/getPost")
    @ResponseBody
    public JSONObject getAll(){
        JSONObject jsonObject = new JSONObject();
        List<N25175Post> n25175Posts = n25175PostMapper.selectByExample(new N25175PostExample());
        jsonObject.put("code",0);
        jsonObject.put("count",n25175Posts.size());
        jsonObject.put("msg","");
        jsonObject.put("data",n25175Posts);
        return jsonObject;
    }


    @RequestMapping("/getDepart")
    @ResponseBody
    public JSONObject getD(){
        List<N25175Organ> depart = departmentService.getDepart();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code",200);
        jsonObject.put("depart",depart);
        return jsonObject;
    }



    //下载
    @RequestMapping("/download")
    public void download(String name,String path,HttpServletRequest request, HttpServletResponse response) throws IOException {
        logger.warn("name:"+name);
        logger.warn("path:"+path);
        path = URLDecoder.decode(path,"UTF-8");
        logger.warn("path:"+path);
        String fileName = URLEncoder.encode(name,"UTF-8")+new SimpleDateFormat("yyyy-MM-dd").format(new Date())+path.substring(path.lastIndexOf("."));
        response.setContentType("application/force-download");
        response.setHeader("content-Disposition", "attachment;fileName="+fileName);
        String realPath = request.getServletContext().getRealPath("/");
        File file = new File(realPath+path);
        ServletOutputStream outputStream=response.getOutputStream();
        if (file.exists()){
            InputStream inputStream = new FileInputStream(realPath+path);
            // System.out.println(IndexController.class.getClassLoader().getResource(path));
            byte[] bytes=new byte[inputStream.available()];
            inputStream.read(bytes);
            outputStream.write(bytes);
            inputStream.close();
            outputStream.close();
        }else{
              outputStream.write("文件不存在".getBytes());
        }

    }
}
