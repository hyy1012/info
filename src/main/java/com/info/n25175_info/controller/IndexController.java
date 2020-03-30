package com.info.n25175_info.controller;

import com.alibaba.fastjson.JSONObject;
import com.info.n25175_info.dao.N25175AdminMapper;
import com.info.n25175_info.dao.N25175UserMapper;
import com.info.n25175_info.entity.N25175AdminExample;
import com.info.n25175_info.entity.N25175User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Class Name:com.info.n25175_info.controller IndexController
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/16 0016 16:15
 * Description: IndexController
 * ==========================
 */
@RequestMapping("/index")
@Controller
public class IndexController {

    @Autowired
    private N25175UserMapper n25175UserMapper;

    @Autowired
    private N25175AdminMapper n25175AdminMapper;

    @RequestMapping("/to_index")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("/toHome")
    public String toHome(){
        return "app/homepage";
    }


    @RequestMapping("/getBorn")
    @ResponseBody
    public JSONObject getBorn(){
        JSONObject jsonObject = new JSONObject();
        List<N25175User> n25175Users = n25175UserMapper.selectByMonth();
        jsonObject.put("users",n25175Users);
        return jsonObject;
    }

    @RequestMapping("/getInfo")
    @ResponseBody
    public JSONObject getInfo(){
        N25175AdminExample adminExample = new N25175AdminExample();
        adminExample.createCriteria().andAStatusNotEqualTo(2).andAStatusNotEqualTo(9);
        long zaizhi = n25175AdminMapper.countByExample(adminExample);
        adminExample.clear();
        adminExample.createCriteria().andAStatusEqualTo(1);
        long shixi = n25175AdminMapper.countByExample(adminExample);
        adminExample.clear();
        adminExample.createCriteria().andAStatusEqualTo(3);
        long shiyong = n25175AdminMapper.countByExample(adminExample);
        adminExample.clear();
        adminExample.createCriteria().andAStatusEqualTo(9);
        long lizhi = n25175AdminMapper.countByExample(adminExample);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code",200);
        jsonObject.put("zaizhi",zaizhi);
        jsonObject.put("shixi",shixi);
        jsonObject.put("shiyong",shiyong);
        jsonObject.put("lizhi",lizhi);
        return jsonObject;
    }
}
