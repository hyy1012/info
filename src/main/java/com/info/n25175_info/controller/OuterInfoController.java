package com.info.n25175_info.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.info.n25175_info.entity.N25175Admin;
import com.info.n25175_info.entity.N25175Submit;
import com.info.n25175_info.service.AdminService;
import com.info.n25175_info.service.SubmitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Class Name:com.info.n25175_info.controller OuterInfoController
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/17 0017 9:41
 * Description: OuterInfoController应聘人员页面
 * ==========================
 */
@Controller
@RequestMapping("/outer")
public class OuterInfoController {


    @Autowired
    private SubmitService submitService;

    @RequestMapping(value = "/toAnswer")
    public String toAnswer(){
        return "user/answer";
    }


    @RequestMapping("/getItem")
    @ResponseBody
    public JSONObject getItem(Integer id){
        JSONObject jsonObject = new JSONObject();
        List<N25175Submit> record = submitService.getRecord(id);
        jsonObject.put("code",200);
        jsonObject.put("record",record);
        return jsonObject;
    }
/*
    private Logger logger = LoggerFactory.getLogger(OuterInfoController.class);

    @Autowired
    private AdminService adminService;


    @Autowired
    private SubmitService submitService;

    //跳转到应聘人员页面
    @RequestMapping(value = "/toOut")
    public String toOuter(){
        return "user/outerInfo";
    }





    *//**
     * 修改用户信息
     * @param admin
     * @return
     *//*
    @RequestMapping(value = "/edit")
    @ResponseBody
    public JSONObject edit(N25175Admin admin){
        JSONObject jsonObject = new JSONObject();
        boolean b = adminService.editAdmin(admin);
        if (b){
            jsonObject.put("code",200);
        }else {
            jsonObject.put("code",201);
        }
        return jsonObject;
    }


    *//**
     * 根据条件分页查询
     * @param page 当前页
     * @param limit 限制数
     * @param name 名字
     * @param request
     * @return
     *//*
    @RequestMapping("/getOuter")
    @ResponseBody
    public JSONObject getOuter(@RequestParam(defaultValue = "1")Integer page, @RequestParam(defaultValue = "10")Integer limit, String name, HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        PageHelper.startPage(page,limit);
        List<N25175Admin> n25175Admins = adminService.selectByStatus(3, name, request);
        PageInfo info = new PageInfo(n25175Admins);
        jsonObject.put("code",0);
        jsonObject.put("count",info.getTotal());
        jsonObject.put("msg","");
        jsonObject.put("data",n25175Admins);

        return jsonObject;
    }

    *//**
     * 删除用户
     * @param id
     * @return
     *//*
    @RequestMapping("/delete")
    @ResponseBody
    public JSONObject delete(Integer id){
        JSONObject jsonObject = new JSONObject();
        boolean b = adminService.deleteAdmin(id);
        if (b){
            jsonObject.put("code",200);
        }else{
            jsonObject.put("code","201");
        }
        return jsonObject;
    }


  */

}
