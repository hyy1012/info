package com.info.n25175_info.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.info.n25175_info.entity.N25175Admin;
import com.info.n25175_info.entity.N25175PersonnelChange;
import com.info.n25175_info.service.AdminService;
import com.info.n25175_info.service.PersonalChangeService;
import com.info.n25175_info.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Class Name:com.info.n25175_info.controller ChangeController
 * ==========================
 * Author: 陈佳峰
 * Date: 2020/1/8 0008 13:40
 * Description: ChangeController
 * ==========================
 */
@Controller
@RequestMapping("/change")
public class ChangeController {


    @Autowired
    private PersonalChangeService personalChangeServicel;

    @Autowired
    private AdminService adminService;

    @Autowired
    private PostService postService;

    @RequestMapping("/toChange")
    public String toChange(){
        return "home/record";
    }

    @RequestMapping("/to_up")
    public String toUp(){
        return "user/upmanage";
    }

    @RequestMapping("/to_leave")
    public String toLeave(){
        return "user/leavemanage";
    }

    @RequestMapping("/to_transfer")
    public String toTransfer(){
        return "user/transfermanage";
    }

    @RequestMapping("/getAllChange")
    @ResponseBody
    public JSONObject getAll(@RequestParam(defaultValue = "10") Integer limit,@RequestParam(defaultValue = "1") Integer page,String name){
     JSONObject jsonObject = new JSONObject();
        PageHelper.startPage(page,limit);
        List<N25175PersonnelChange> record = personalChangeServicel.getRecord(name);
        PageInfo info = new PageInfo(record);
        jsonObject.put("code",0);
        jsonObject.put("count",info.getTotal());
        jsonObject.put("data",info.getList());
        jsonObject.put("msg","");
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
    public JSONObject getInner(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer limit,
                      String field, String order, Integer status, String name, HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        PageHelper.startPage(page,limit);
        List<N25175Admin> n25175Admins = adminService.selectByStatus(status, null, name, request, field, order);
        PageInfo info = new PageInfo(n25175Admins);
        jsonObject.put("code",0);
        jsonObject.put("count",info.getTotal());
        jsonObject.put("msg","");
        jsonObject.put("data",n25175Admins);

        return jsonObject;
    }

    /**
     * 员工转正
     * @param aId
     * @return
     */
    @RequestMapping("/upsure")
    @ResponseBody
    public JSONObject upsure(Integer aId, String uname, Integer oStatus, Integer nStatus){
        JSONObject jsonObject = new JSONObject();
        boolean b = adminService.upAdminByAId(aId, uname, oStatus, nStatus);
        if (b){
            jsonObject.put("code",200);
        }else{
            jsonObject.put("code",201);
        }
        return jsonObject;
    }

    /**
     * 员工离职
     * @param aId
     * @return
     */
    @RequestMapping("/leavesure")
    @ResponseBody
    public JSONObject leavesure(Integer aId, String uname, Integer oStatus){
        JSONObject jsonObject = new JSONObject();
        boolean b = adminService.leaveAdminByAId(aId, uname, oStatus);
        if (b){
            jsonObject.put("code",200);
        }else{
            jsonObject.put("code",201);
        }
        return jsonObject;
    }

    /**
     * 员工调动
     * @param aId
     * @return
     */
    @RequestMapping("/transfersure")
    @ResponseBody
    public JSONObject transfersure(Integer aId, String uname, Integer oPost, Integer nPost){
        JSONObject jsonObject = new JSONObject();
        boolean b = postService.editUserPost(aId, uname, oPost, nPost);
        if (b){
            jsonObject.put("code",200);
        }else{
            jsonObject.put("code",201);
        }
        return jsonObject;
    }
}


