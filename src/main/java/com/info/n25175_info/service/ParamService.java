package com.info.n25175_info.service;

import com.info.n25175_info.entity.N25175Param;

/**
 * Class Name:com.info.n25175_info.service ParamService
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/25 0025 16:05
 * Description: ParamService
 * ==========================
 */
public interface ParamService {
    /**
     * 根据参数名查询参数信息
     * @param name
     * @return
     */
    N25175Param getParamByString(String name);

    /**
     * 根据参数名设置参数值
     */
    boolean setParamByName(String name,Integer amount);

}
