package com.info.n25175_info.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.info.n25175_info.dao.N25175SchoolMapper;
import com.info.n25175_info.dao.N25175UserEnableMapper;
import com.info.n25175_info.dao.N25175UserMapper;
import com.info.n25175_info.entity.N25175Admin;
import com.info.n25175_info.entity.N25175User;
import com.info.n25175_info.entity.N25175UserEnable;
import com.info.n25175_info.entity.N25175UserExample;
import com.info.n25175_info.service.AdminService;
import com.info.n25175_info.service.UserService;
import com.info.n25175_info.utils.GetUUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Class Name: com.info.n25175_info.service.impl.UserServiceImpl
 * ==================================
 * Author c25175 黄凯
 * Date 2019/12/1614:56
 * Description: UserServiceImpl
 * ==================================
 */
@Service("userService")
@Slf4j
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private N25175UserMapper n25175UserMapper;

    @Autowired
    private N25175UserEnableMapper n25175UserEnableMapper;

    @Autowired
    private N25175SchoolMapper n25175SchoolMapper;

    @Autowired
    private AdminService adminService;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public JSONObject add(N25175User n25175User) {
        JSONObject jsonObject = new JSONObject();
        try{
            if (checkUAidExists(n25175User.getuAid())) {
                jsonObject.put("code", 201);
                jsonObject.put("msg", "员工号已存在");
            } else {
                int i = n25175UserMapper.insert(n25175User);
                jsonObject.put("code", 200);
                jsonObject.put("msg", "添加成功");
            }
        }catch (RuntimeException e){
            jsonObject.put("code", 202);
            jsonObject.put("msg", "添加失败"+e);
        }
        return jsonObject;
    }

    @Override
    public JSONObject editProfile(N25175User n25175User, HttpSession session) {
        JSONObject jsonObject = new JSONObject();
        N25175Admin user = (N25175Admin)session.getAttribute("user");
        try{
            if (!checkUAidExists(n25175User.getuAid())) {
                jsonObject.put("code", 201);
                jsonObject.put("msg", "员工号不存在");
            } else {
                int i = updateByUAid(n25175User);
                if (user.getaRole() != 0) {
                    user.setaEdit(2);
                  //  adminService.editAdmin(user);
                    session.setAttribute("user", user);
                }
                jsonObject.put("code", 200);
                jsonObject.put("msg", "修改成功");
            }
        }catch (RuntimeException e){
            jsonObject.put("code", 202);
            jsonObject.put("msg", "修改失败"+e);
        }
        return jsonObject;
    }

    @Override
    public N25175User findByuAid(Integer uAid) {
        List<N25175User> n25175Users = findByUAid(uAid);
        try{
            if (n25175Users.size()==1){
                return n25175Users.get(0);
            } else{
                throw new RuntimeException("员工号有误");
            }
        }catch (RuntimeException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public JSONObject showProfile(Integer uAid) {
        JSONObject jsonObject = new JSONObject();
        List<N25175User> n25175Users = findByUAid(uAid);
        try{
            if (n25175Users.size()==1){
                jsonObject.put("code", 200);
                jsonObject.put("user", n25175Users.get(0));
            } else{
                jsonObject.put("code", 201);
                jsonObject.put("msg", "员工id有误");
            }
        }catch (RuntimeException e){
            jsonObject.put("code", 202);
            jsonObject.put("msg", "其他错误"+e);
        }
        return jsonObject;
    }

    @Override
    public JSONObject editDef(N25175UserEnable n25175UserEnable) {
        JSONObject jsonObject = new JSONObject();
        n25175UserEnable.setId(1);
        int i = n25175UserEnableMapper.updateByPrimaryKey(n25175UserEnable);
        try{
            if (i == 1) {
                jsonObject.put("code", 200);
                jsonObject.put("msg", "提交成功");
            } else {
                jsonObject.put("code", 201);
                jsonObject.put("msg", "提交失败");
            }
        }catch (RuntimeException e){
            jsonObject.put("code", 202);
            jsonObject.put("msg", "提交失败"+e);
        }
        return jsonObject;
    }

    @Override
    public JSONObject showDef() {
        JSONObject jsonObject = new JSONObject();
        N25175UserEnable n25175UserEnable = n25175UserEnableMapper.selectByPrimaryKey(1);
        jsonObject.put("code", 200);
        jsonObject.put("userEnable", n25175UserEnable);
        return jsonObject;
    }

    @Override
    public int insertPhoto(Integer uAid, String path) {
        int i = 0;
        List<N25175User> n25175Users = findByUAid(uAid);
        if (n25175Users.size() == 1){
            N25175User n25175User = n25175Users.get(0);
            n25175User.setuPicture(path);
            i = updateByUAid(n25175User);
        }
        return i;
    }

    @Override
    public List<String> findAllSchools() {
        List<String> schools = n25175SchoolMapper.selectAllSchools();
        return schools;
    }

    @Override
    public List<String> findSchools(String name) {
        List<String> schools = n25175SchoolMapper.selectSchools(name);
        return schools;
    }

    @Override
    public boolean existByphone(String phone) {
        N25175UserExample n25175UserExample = new N25175UserExample();
        n25175UserExample.createCriteria().andUPhoneEqualTo(phone);
        List<N25175User> n25175Users = n25175UserMapper.selectByExample(n25175UserExample);
        return n25175Users.size() > 0;
    }

//    @Override
//    public List<Integer> findAllIds(String name) {
//        String sql = "select np_name from n25175_post WHERE np_id ="+id;
//        jdbcTemplate.queryForObject(sql, String.class);
//        List<Integer> ids = adminService.selectSchools(name);
//        return schools;
//    }

    public boolean checkUAidExists(Integer uAid) {
        N25175UserExample n25175UserExample = new N25175UserExample();
        n25175UserExample.createCriteria().andUAidEqualTo(uAid);
        List<N25175User> n25175Users = n25175UserMapper.selectByExample(n25175UserExample);
        return n25175Users.size()!=0;
    }

    public List<N25175User> findByUAid(Integer uAid) {
        N25175UserExample n25175UserExample = new N25175UserExample();
        n25175UserExample.createCriteria().andUAidEqualTo(uAid);
        List<N25175User> n25175Users = n25175UserMapper.selectByExample(n25175UserExample);
        return n25175Users;
    }

    public int updateByUAid(N25175User record) {
        Integer uAge = record.getuAge();
        if(uAge != null && (uAge<0 || uAge>100)){
            throw new RuntimeException("年龄不合法");
        }
        Integer uHeight = record.getuHeight();
        if(uHeight != null && (uHeight<0 || uHeight>200)){
            throw new RuntimeException("身高不合法");
        }
        N25175UserExample n25175UserExample = new N25175UserExample();
        n25175UserExample.createCriteria().andUAidEqualTo(record.getuAid());
        return n25175UserMapper.updateByExampleSelective(record, n25175UserExample);
    }


    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public boolean baseInsert(HttpServletRequest request, N25175User user, MultipartFile file) throws IOException {
        if (file!=null){
            String realPath = request.getServletContext().getRealPath("/");
            String filename = file.getOriginalFilename();
            String suffix=filename.substring(filename.lastIndexOf("."));
            String prefix= GetUUID.getUUID();
            String realName ="uploadFile"+ File.separator+ prefix+suffix;
            File fileTo=new File(realPath+File.separator+realName);
            if (!fileTo.getParentFile().exists()){
                fileTo.getParentFile().mkdirs();
            }
            file.transferTo(fileTo);
            user.setuFile(realName);
        }
        int i = n25175UserMapper.updateByPrimaryKeySelective(user);
        if (i>0)
            return true;
        else
        return false;
    }

}
