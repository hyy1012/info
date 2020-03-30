package com.info.n25175_info.controller;

import com.alibaba.fastjson.JSONObject;
import com.info.n25175_info.service.LoginService;
import org.apache.tools.ant.taskdefs.condition.Http;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Class Name:com.info.n25175_info.controller LoginController
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/16 0016 15:36
 * Description: LoginController  登录
 * ==========================
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    private Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping("/to_login")
    public String toLogin(HttpServletRequest request){
        String lg=request.getParameter("lg");
        if (lg!=null){
            request.setAttribute("flag",1);
        }
        return "user/login";
    }

    @RequestMapping("/confirm")
    @ResponseBody
    public JSONObject confirm(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        Object user = request.getSession().getAttribute("user");
        if (user!=null){
            jsonObject.put("code",200);
        }else
        {
            jsonObject.put("code",201);
        }
        return jsonObject;
    }

    @RequestMapping("/login")
    @ResponseBody
    public JSONObject login(String username, String password, HttpServletRequest request){
        boolean login = loginService.login(username, password, request);
        JSONObject jsonObject = new JSONObject();
        if (login){
            jsonObject.put("code",200);
            jsonObject.put("msg","登录成功");
        }else {
            jsonObject.put("code",201);
            jsonObject.put("msg","账号密码错误");
        }
        return  jsonObject;
    }

    @RequestMapping("/loginOut")
    @ResponseBody
    public JSONObject loginOut(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        boolean b = loginService.loginOut(request);
        if (b){
            jsonObject.put("code",200);
        }else{
            jsonObject.put("code",201);
        }
        return  jsonObject;
    }


    @RequestMapping("/to_edit")
    public String toEdit(){
        return "set/user/password";
    }


    @RequestMapping("/edit")
    @ResponseBody
    public JSONObject edit(String old,String newPassword,HttpServletRequest request){
        JSONObject jsonObject1 = loginService.editPassword(old, newPassword, request);
        return jsonObject1;
    }

}
