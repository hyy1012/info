package com.info.n25175_info.controller;

import com.alibaba.fastjson.JSONObject;
import com.info.n25175_info.entity.N25175Text;
import com.info.n25175_info.entity.N25175User;
import com.info.n25175_info.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Class Name:com.info.n25175_info.controller TextController
 * ==========================
 * Author: dhh
 * Date: 2020/1/22 11:14
 * Description: TextController
 * ==========================
 */
@Controller
@RequestMapping("/text")
public class TextController {

    @Autowired
    private TextService textService;

    @RequestMapping("/getText")
    @ResponseBody
    public JSONObject getText(Integer pid){
        JSONObject jsonObject = new JSONObject();
        List<N25175Text> n25175Texts = textService.findByPid(pid);
        jsonObject.put("texts",n25175Texts);
        return jsonObject;
    }

    @RequestMapping("/addText")
    @ResponseBody
    public JSONObject addText(N25175Text text){
        JSONObject jsonObject = new JSONObject();
        int i = textService.addOneText(text);
        jsonObject.put("i", i);
        return jsonObject;
    }

}
