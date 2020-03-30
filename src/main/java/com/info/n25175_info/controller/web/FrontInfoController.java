package com.info.n25175_info.controller.web;

import com.alibaba.fastjson.JSONObject;
import com.info.n25175_info.dao.N25175AdminMapper;
import com.info.n25175_info.entity.N25175Admin;
import com.info.n25175_info.entity.N25175AdminExample;
import com.info.n25175_info.entity.N25175User;
import com.info.n25175_info.service.UserService;
import com.info.n25175_info.utils.Des;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

/**
 * Class Name:com.info.n25175_info.controller.web FrontInfoController
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/27 0027 15:37
 * Description: FrontInfoController
 * ==========================
 */
@Controller
@RequestMapping("/web_info")
@CrossOrigin
public class FrontInfoController {

    @Autowired
    private UserService userService;

    @Autowired
    private N25175AdminMapper n25175AdminMapper;

    @RequestMapping("/getInfo")
    @ResponseBody
    public JSONObject get(HttpServletRequest request){
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
                    if (n25175Admins.get(0).getaSub()!=1){
                        jsonObject.put("code",202);
                        return jsonObject;
                    }
                    N25175User byuAid = userService.findByuAid(n25175Admins.get(0).getaId());
                    jsonObject.put("user",byuAid);
                    jsonObject.put("code",200);
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


    @RequestMapping("/getInfo2")
    @ResponseBody
    public JSONObject get2(HttpServletRequest request){
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
                    N25175User byuAid = userService.findByuAid(n25175Admins.get(0).getaId());
                    jsonObject.put("user",byuAid);
                    jsonObject.put("code",200);
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


    @RequestMapping("/updateInfo")
    @ResponseBody
    public JSONObject updateInfo(HttpServletRequest request, N25175User user, MultipartFile file){
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
                    try {
                        boolean b = userService.baseInsert(request, user, file);
                        if (b){
                            N25175Admin admin = n25175Admins.get(0);
                            admin.setaSub(2);
                            n25175AdminMapper.updateByPrimaryKeySelective(admin);
                            jsonObject.put("code",200);
                        }else{
                            jsonObject.put("code",202);
                        }
                    } catch (IOException e) {
                        jsonObject.put("code",202);
                        e.printStackTrace();
                    }


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
