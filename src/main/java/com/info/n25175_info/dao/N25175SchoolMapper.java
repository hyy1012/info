package com.info.n25175_info.dao;

import com.info.n25175_info.entity.N25175School;
import com.info.n25175_info.entity.N25175SchoolExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface N25175SchoolMapper {
    long countByExample(N25175SchoolExample example);

    int deleteByExample(N25175SchoolExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(N25175School record);

    int insertSelective(N25175School record);

    List<N25175School> selectByExample(N25175SchoolExample example);

    N25175School selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") N25175School record, @Param("example") N25175SchoolExample example);

    int updateByExample(@Param("record") N25175School record, @Param("example") N25175SchoolExample example);

    int updateByPrimaryKeySelective(N25175School record);

    int updateByPrimaryKey(N25175School record);

    List<String> selectAllSchools();

    List<String> selectSchools(String name);
}