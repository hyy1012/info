package com.info.n25175_info.service;

import com.alibaba.fastjson.JSONObject;
import com.info.n25175_info.entity.N25175Admin;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Class Name:com.info.n25175_info.service LoginService
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/16 0016 14:49
 * Description: LoginService
 * ==========================
 */
public interface LoginService {
    /**
     * 登录
     * @param username 账号
     * @param password 密码
     * @return
     */
    boolean login(String username,String password,HttpServletRequest request);

    //登出
    boolean loginOut(HttpServletRequest request);

    /**
     * 修改密码
     * @param old 旧密码
     * @param newPassword 新密码
     * @return
     */
    JSONObject editPassword(String old,String newPassword,HttpServletRequest request);


    //-------------------------------------------------

    /**
     * 注册
     */
    boolean register(String phone,String name,Integer money,Integer sex , Integer post);


    /**
     * 登录
     */
    boolean frontLogin(String username,String password);




}
