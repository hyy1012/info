package com.info.n25175_info.service;

import com.info.n25175_info.entity.N25175PersonnelChange;

import java.util.List;

/**
 * Class Name:com.info.n25175_info.service PersonalChangeService
 * ==========================
 * Author: 陈佳峰
 * Date: 2020/1/8 0008 9:54
 * Description: PersonalChangeService
 * ==========================
 */
public interface PersonalChangeService {

    boolean addRecord(String name,Integer s1,Integer s2,Integer p1,Integer p2,Integer o1,Integer o2);



    List<N25175PersonnelChange> getRecord(String name);
}
