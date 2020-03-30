package com.info.n25175_info.service.impl;

import com.info.n25175_info.dao.N25175TextMapper;
import com.info.n25175_info.entity.N25175Text;
import com.info.n25175_info.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Class Name:com.info.n25175_info.service.impl TextServiceImpl
 * ==========================
 * Author: dhh
 * Date: 2020/1/22 11:11
 * Description: TextServiceImpl
 * ==========================
 */
@Service
public class TextServiceImpl implements TextService {

    @Autowired
    private N25175TextMapper textMapper;

    @Override
    public List<N25175Text> findByPid(Integer id) {
        return textMapper.findByPid(id);
    }

    @Override
    public N25175Text findById(Integer id) {
        return textMapper.findById(id);
    }

    @Override
    public List<N25175Text> findAll() {
        return textMapper.findAll();
    }

    @Override
    public int addOneText(N25175Text text) {
        return textMapper.addOneText(text);
    }
}
