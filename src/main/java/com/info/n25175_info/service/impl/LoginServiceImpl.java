package com.info.n25175_info.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.info.n25175_info.dao.N25175AdminMapper;
import com.info.n25175_info.dao.N25175UserMapper;
import com.info.n25175_info.entity.N25175Admin;
import com.info.n25175_info.entity.N25175AdminExample;
import com.info.n25175_info.entity.N25175User;
import com.info.n25175_info.service.LoginService;
import com.info.n25175_info.utils.LoginCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * Class Name:com.info.n25175_info.service.impl LoginServiceImpl
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/16 0016 14:49
 * Description: LoginServiceImpl
 * ==========================
 */
@Service
public class  LoginServiceImpl implements LoginService {

    @Autowired
    private N25175AdminMapper n25175AdminMapper;

    @Autowired
    private N25175UserMapper n25175UserMapper;

    private Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public boolean login(String username, String password, HttpServletRequest request) {
        logger.warn("username:"+username + "-password:"+password);
        N25175AdminExample n25175AdminExample = new N25175AdminExample();
        n25175AdminExample.createCriteria().andAUsernameEqualTo(username).andAPasswordEqualTo(password).andAStatusNotEqualTo(2).andAStatusNotEqualTo(9);
        List<N25175Admin> n25175Admins = n25175AdminMapper.selectByExample(n25175AdminExample);
        if (n25175Admins.size()>0){
            request.getSession().setAttribute("user",n25175Admins.get(0));
         request.getSession().setMaxInactiveInterval(-1);
         return true;
        }
        return false;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public boolean loginOut(HttpServletRequest request) {
        LoginCache.getInstance().removeSession(((N25175Admin)request.getSession().getAttribute("user")).getaUsername());
        request.getSession().invalidate();
        return false;
    }

    @Override
    @Transactional
    public JSONObject editPassword(String old, String newPassword, HttpServletRequest request) {
        N25175AdminExample n25175AdminExample = new N25175AdminExample();
        n25175AdminExample.createCriteria().andAUsernameEqualTo(((N25175Admin)request.getSession().getAttribute("user")).getaUsername()).andAPasswordEqualTo(old);
        List<N25175Admin> n25175Admins = n25175AdminMapper.selectByExample(n25175AdminExample);
        JSONObject jsonObject = new JSONObject();
        if (n25175Admins.size()>0){
            N25175Admin n25175Admin = n25175Admins.get(0);
            n25175Admin.setaPassword(newPassword);
            n25175AdminMapper.updateByPrimaryKey(n25175Admin);
            LoginCache.getInstance().removeSession(((N25175Admin)request.getSession().getAttribute("user")).getaUsername());
            request.getSession().invalidate();
            jsonObject.put("code",200);
            jsonObject.put("msg","修改成功");
        }else{
            jsonObject.put("code",201);
            jsonObject.put("msg","修改失败，请检查密码是否正确");
        }
        return jsonObject;
    }

    @Override
    @Transactional
    public boolean register( String phone, String name, Integer money, Integer sex, Integer post) {
        N25175AdminExample n25175AdminExample = new N25175AdminExample();
        n25175AdminExample.createCriteria().andAUsernameEqualTo(name);
        List<N25175Admin> n25175Admins = n25175AdminMapper.selectByExample(n25175AdminExample);
        if (n25175Admins.size()>0){
            return  false;
        }
        N25175Admin admin = new N25175Admin();
        admin.setaEdit(1);
        admin.setaDate(new Date());
        admin.setaStatus(2);
        admin.setaPassword(phone);
        admin.setaUsername(name);
        admin.setaRole(2);
        n25175AdminMapper.insertSelective(admin);
        N25175User user = new N25175User();
        user.setuAid(admin.getaId());
        user.setuPhone(phone);
        user.setuName(name);
        user.setuTreatment(money);
        user.setuSex(sex);
        user.setuPost(post);
        n25175UserMapper.insertSelective(user);
        return true;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public boolean frontLogin(String username, String password) {
     N25175AdminExample n25175AdminExample = new N25175AdminExample();
     n25175AdminExample.createCriteria().andARoleNotEqualTo(0).andAStatusNotEqualTo(9).andAUsernameEqualTo(username).andAPasswordEqualTo(password);
        List<N25175Admin> n25175Admins = n25175AdminMapper.selectByExample(n25175AdminExample);
       if (n25175Admins.size()>0){
           return true;
       }
        return false;
    }
}
