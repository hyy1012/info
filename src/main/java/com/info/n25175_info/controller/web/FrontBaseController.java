package com.info.n25175_info.controller.web;

import com.alibaba.fastjson.JSONObject;
import com.info.n25175_info.dao.N25175AdminMapper;
import com.info.n25175_info.entity.N25175Admin;
import com.info.n25175_info.entity.N25175AdminExample;
import com.info.n25175_info.entity.N25175Post;
import com.info.n25175_info.entity.N25175User;
import com.info.n25175_info.service.PostService;
import com.info.n25175_info.utils.Des;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Class Name:com.info.n25175_info.controller.web FrontBaseController
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/21 0021 14:45
 * Description: FrontBaseController
 * ==========================
 */
@RequestMapping("/web_base")
@Controller
@CrossOrigin
public class FrontBaseController {

    @Autowired
    private PostService postService;


    @Autowired
    private N25175AdminMapper n25175AdminMapper;

    @RequestMapping("/getPost")
    @ResponseBody
    public JSONObject getAll(){
        JSONObject jsonObject = new JSONObject();
        List<N25175Post> allPostBySelect = postService.getAllPostBySelect();
        jsonObject.put("code",200);
        jsonObject.put("post",allPostBySelect);
        return jsonObject;
    }



    @RequestMapping("/getInfo")
    @ResponseBody
    public JSONObject getAll(HttpServletRequest request){
        String token = request.getHeader("token");
        JSONObject jsonObject = new JSONObject();
        if (token!=null){
            String decrypt = Des.decrypt(Des.DesPassword, token);
            String[] split = decrypt.split("-");
            if (split.length==2){
                N25175AdminExample n25175AdminExample = new N25175AdminExample();
                n25175AdminExample.createCriteria().andAUsernameEqualTo(split[1]);
                List<N25175Admin> n25175Admins = n25175AdminMapper.selectByExample(n25175AdminExample);
                if (n25175Admins.size()>0){
                    jsonObject.put("code",200);
                    jsonObject.put("admin",n25175Admins.get(0));
                }else{
                    jsonObject.put("code",201);
                }
            }else{
                jsonObject.put("code",201);
            }
        }else{
            jsonObject.put("code",201);
        }
        return jsonObject;
    }

}
