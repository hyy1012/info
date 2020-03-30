package com.info.n25175_info.controller;

import com.alibaba.fastjson.JSONObject;
import com.info.n25175_info.dto.AVGMoney;
import com.info.n25175_info.entity.N25175Post;
import com.info.n25175_info.service.AdminService;
import com.info.n25175_info.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Class Name: com.info.n25175_info.controller.EChartsController
 * ==================================
 * Author c25175 黄凯
 * Date 2020/1/20 9:08
 * Description: EChartsController
 * ==================================
 */
@Controller
@RequestMapping("/echarts")
public class EChartsController {

    @Autowired
    private PostService postService;

    @Autowired
    private AdminService adminService;

    @RequestMapping("/getPost")
    @ResponseBody
    public JSONObject getPost(){
        Map<String, Integer> map = postService.groupCount();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code",200);
        jsonObject.put("map",map);
        return jsonObject;
    }

    @RequestMapping("/getMoney")
    @ResponseBody
    public JSONObject getMoney(){
        List<AVGMoney> list = adminService.groupMoney();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code",200);
        jsonObject.put("list",list);
        return jsonObject;
    }

}
