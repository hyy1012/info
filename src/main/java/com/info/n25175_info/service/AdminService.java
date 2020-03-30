package com.info.n25175_info.service;

import com.info.n25175_info.dto.AVGMoney;
import com.info.n25175_info.entity.N25175Admin;
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
public interface AdminService {

    /**
     * 查询条件查询人员
     * @param request
     * @return
     */
    List<N25175Admin> selectByStatus(Integer status,Integer role,String name,HttpServletRequest request, String field, String sort);



    /**
     * 添加员工信息
     * @param admin
     * @param phone
     * @param sex
     * @param name
     * @return
     */
    boolean addAdmin(N25175Admin admin,String phone,Integer sex,String name,Integer post);

    /**
     * 添加员工信息
     * @param admin
     * @return
     */
    boolean addAdmin(N25175Admin admin, N25175User user);


    /**
     * 删除员工
     * @param id
     * @return
     */
    boolean deleteAdmin(Integer id);

    /**
     * 编辑员工信息
     */
    boolean editAdmin(N25175Admin admin,String name,Integer s1,Integer p1,Integer p2,Integer o1);

    /**
     * 查询手机号是否已存在
     */
    boolean existByphone(String phone);

    /**
     * 根据状态查询所有Id
     */
    List<Integer> findAIdsByAStauts(Integer aStatus);

    /**
     * 员工转正
     * @param id
     * @return
     */
    boolean upAdminByAId(Integer id, String name, Integer oStatus, Integer nStatus);

    /**
     * 员工离职
     * @param id
     * @return
     */
    boolean leaveAdminByAId(Integer id, String name, Integer oStatus);

    /**
     * 统计平均月份期望和答题工资
     * @return
     */
    List<AVGMoney> groupMoney();

    /**
     * 根据状态查询所有Id =>lisufer
     */
    List<Integer> findAIdsByADepart(Integer aDepart);

}
