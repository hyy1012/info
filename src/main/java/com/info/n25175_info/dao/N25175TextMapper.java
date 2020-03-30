package com.info.n25175_info.dao;

import com.info.n25175_info.entity.N25175Text;
import com.info.n25175_info.entity.N25175User;
import com.info.n25175_info.entity.N25175UserExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface N25175TextMapper {
    List<N25175Text> findByPid(Integer id);

    N25175Text findById(Integer id);

    List<N25175Text> findAll();

    int addOneText(N25175Text text);
}