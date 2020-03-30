package com.info.n25175_info.service.impl;

import com.info.n25175_info.dao.N25175ParamMapper;
import com.info.n25175_info.entity.N25175Param;
import com.info.n25175_info.entity.N25175ParamExample;
import com.info.n25175_info.service.ParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Class Name:com.info.n25175_info.service.impl ParamServiceImpl
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/25 0025 16:09
 * Description: ParamServiceImpl
 * ==========================
 */
@Service
public class ParamServiceImpl implements ParamService {

    @Autowired
    private N25175ParamMapper n25175ParamMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public N25175Param getParamByString(String name) {
        N25175ParamExample n25175ParamExample = new N25175ParamExample();
        n25175ParamExample.createCriteria().andPNameEqualTo(name);
        List<N25175Param> n25175Params = n25175ParamMapper.selectByExample(n25175ParamExample);
        if (n25175Params.size()>0){
            return n25175Params.get(0);
        }
        return null;
    }



    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean setParamByName(String name, Integer amount) {
        N25175ParamExample n25175ParamExample = new N25175ParamExample();
        n25175ParamExample.createCriteria().andPNameEqualTo(name);
        N25175Param param = new N25175Param();
        param.setpValue(amount);
        int i = n25175ParamMapper.updateByExampleSelective(param, n25175ParamExample);
        if (i>0){
            return true;
        }
        return false;
    }
}
