package com.info.n25175_info.dao;

import com.info.n25175_info.entity.N25175PersonnelChange;
import com.info.n25175_info.entity.N25175PersonnelChangeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface N25175PersonnelChangeMapper {
    long countByExample(N25175PersonnelChangeExample example);

    int deleteByExample(N25175PersonnelChangeExample example);

    int deleteByPrimaryKey(Integer pcId);

    int insert(N25175PersonnelChange record);

    int insertSelective(N25175PersonnelChange record);

    List<N25175PersonnelChange> selectByExample(N25175PersonnelChangeExample example);

    N25175PersonnelChange selectByPrimaryKey(Integer pcId);

    int updateByExampleSelective(@Param("record") N25175PersonnelChange record, @Param("example") N25175PersonnelChangeExample example);

    int updateByExample(@Param("record") N25175PersonnelChange record, @Param("example") N25175PersonnelChangeExample example);

    int updateByPrimaryKeySelective(N25175PersonnelChange record);

    int updateByPrimaryKey(N25175PersonnelChange record);
}