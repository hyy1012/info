package com.info.n25175_info.service;

import com.alibaba.fastjson.JSONObject;
import com.info.n25175_info.entity.N25175User;
import com.info.n25175_info.entity.N25175UserEnable;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

/**
 * @author c25175
 * @date 2019/12/16
 */
public interface UserService {

    JSONObject add(N25175User n25175User);

    JSONObject editProfile(N25175User n25175User, HttpSession session);

    JSONObject showProfile(Integer uAid);

    JSONObject editDef(N25175UserEnable n25175UserEnable);

    JSONObject showDef();

    int insertPhoto(Integer uAid, String path);

    List<String> findAllSchools();

    N25175User findByuAid(Integer uAid);

    List<String> findSchools(String name);

    boolean existByphone(String phone);

    boolean baseInsert(HttpServletRequest request, N25175User user, MultipartFile file) throws IOException;

}
