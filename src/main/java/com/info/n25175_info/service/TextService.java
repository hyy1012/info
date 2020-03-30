package com.info.n25175_info.service;

import com.info.n25175_info.dto.AVGMoney;
import com.info.n25175_info.entity.N25175Admin;
import com.info.n25175_info.entity.N25175Text;
import com.info.n25175_info.entity.N25175User;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Class Name:com.info.n25175_info.service AdminService
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/17 0017 9:45
 * Description: AdminService
 * ==========================
 */
public interface TextService {

    /**
     * 查询pid查询试卷
     * @return
     */
    List<N25175Text> findByPid(Integer id);

    /**
     * 查询id查询试卷
     * @return
     */
    N25175Text findById(Integer id);

    /**
     * 查询所有试卷
     * @return
     */
    List<N25175Text> findAll();

    /**
     * 添加试卷
     * @return
     */
    int addOneText(N25175Text text);

}
