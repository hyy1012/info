package com.info.n25175_info.controller;

import com.alibaba.fastjson.JSONObject;
import com.info.n25175_info.entity.N25175Param;
import com.info.n25175_info.service.ParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.bind.util.JAXBSource;

/**
 * Class Name:com.info.n25175_info.controller ParamController
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/25 0025 16:17
 * Description: ParamController
 * ==========================
 */
@RequestMapping("/param")
@Controller
public class ParamController {

    @Autowired
    private ParamService paramService;


    @RequestMapping("/toParam")
    public String toParam(){
        return "system/timeSet";
    }


    @RequestMapping("/get")
    @ResponseBody
    public JSONObject get(String name){
        JSONObject jsonObject = new JSONObject();
        N25175Param paramByString = paramService.getParamByString(name);
        jsonObject.put("code",200);
        jsonObject.put("param",paramByString);
        return jsonObject;
    }


    @RequestMapping("/set")
    @ResponseBody
    public JSONObject set(String name,Integer amount){
        JSONObject jsonObject = new JSONObject();
        boolean paramByString = paramService.setParamByName(name,amount);
        if (paramByString){
            jsonObject.put("code",200);
        }else{
            jsonObject.put("code",201);
        }
        return jsonObject;
    }
}
