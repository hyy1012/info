package com.info.n25175_info.controller.web;

import com.alibaba.fastjson.JSONObject;
import com.info.n25175_info.service.LoginService;
import com.info.n25175_info.utils.Des;
import com.info.n25175_info.utils.GetUUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Class Name:com.info.n25175_info.controller.web FrontLoginController
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/19 0019 16:58
 * Description: FrontLoginController
 * ==========================
 */
@RequestMapping("/web_login")
@Controller
@CrossOrigin
public class FrontLoginController {

    @Autowired
      private LoginService loginService;

    private Logger logger = LoggerFactory.getLogger(FrontLoginController.class);



    @RequestMapping("/login")
    @ResponseBody
    public JSONObject login(String username,String password){
        boolean b = loginService.frontLogin(username, password);
        JSONObject jsonObject = new JSONObject();
        if (b){
        String data = GetUUID.getUUID()+"-"+username;
            String encrypt = Des.encrypt(Des.DesPassword, data);
            jsonObject.put("code",200);
            jsonObject.put("token",encrypt);
        }else{
           jsonObject.put("code",201);
        }
        return jsonObject;
    }



    @RequestMapping("/register")
    @ResponseBody
    public JSONObject register(String phone,String name,Integer money,Integer sex , Integer post){
        JSONObject  jsonObject = new JSONObject();
        boolean register = loginService.register( phone, name, money, sex, post);
        if (register){
            String data = GetUUID.getUUID()+"-"+name;
            String encrypt = Des.encrypt(Des.DesPassword, data);
            jsonObject.put("code",200);
            jsonObject.put("token",encrypt);
        }else{
            jsonObject.put("code",201);
        }
        return jsonObject;
    }

}
