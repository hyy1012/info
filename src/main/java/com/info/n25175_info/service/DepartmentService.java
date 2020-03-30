package com.info.n25175_info.service;

import com.info.n25175_info.dto.OrganDto;
import com.info.n25175_info.entity.N25175Organ;

import java.util.List;

/**
 * Class Name:com.info.n25175_info.service DepartmentService
 * ==========================
 * Author: 陈佳峰
 * Date: 2020/1/7 0007 14:50
 * Description: DepartmentService
 * ==========================
 */
public interface DepartmentService {

    List<N25175Organ> getAll(Integer pid);

    /**
     * 添加
     * @param
     * @return
     */
    boolean add(N25175Organ organ);

    boolean edit(N25175Organ organ);

    boolean delete(Integer id);

    List<N25175Organ> getDepart();

    OrganDto getOrganDto(OrganDto organDto,N25175Organ organ);

}
