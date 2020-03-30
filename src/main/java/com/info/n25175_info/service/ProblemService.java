package com.info.n25175_info.service;

import com.alibaba.fastjson.JSONObject;
import com.info.n25175_info.dto.ProblemDto;
import com.info.n25175_info.entity.N25175Problem;

import java.util.List;

/**
 * Class Name:com.info.n25175_info.service ProblemService
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/20 0020 8:58
 * Description: ProblemService
 * ==========================
 */
public interface ProblemService {
    /**
     * 获得所有的题目信息
     * @param id
     * @return
     */
    List<ProblemDto> getAllProblem(Integer id);

    /**
     * 删除题目
     */
    boolean deleteByID(Integer id);

    /**
     * 删除试卷
     */
    boolean deleteByProblemId(Integer id);

    /**
     * 修改题目
     */
    boolean editByProblemId(ProblemDto problem);


    /**
     * 添加题目
     */
    boolean addProblem(ProblemDto problem);


    N25175Problem getOne(Integer id);


    /**
     * 根据Token 返回所有的题目
     * @param token
     * @return
     */
    JSONObject getAllProblemByToken(String token);


    /**
     * 更换位置
     */
    JSONObject change(Integer id1,Integer id2);


}
