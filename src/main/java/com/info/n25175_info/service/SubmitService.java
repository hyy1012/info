package com.info.n25175_info.service;

import com.alibaba.fastjson.JSONObject;
import com.info.n25175_info.dto.SubmitBody;
import com.info.n25175_info.entity.N25175Submit;

import java.util.List;

/**
 * Class Name:com.info.n25175_info.service SubmitService
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/21 0021 17:24
 * Description: SubmitService
 * ==========================
 */
public interface SubmitService {


        JSONObject setRecord(String token, SubmitBody body);



        List<N25175Submit> getRecord(Integer id);
}
