package com.info.n25175_info.dao;

import com.info.n25175_info.dto.OrganDto;
import com.info.n25175_info.entity.N25175Organ;
import com.info.n25175_info.entity.N25175OrganExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface N25175OrganMapper {
    long countByExample(N25175OrganExample example);

    int deleteByExample(N25175OrganExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(N25175Organ record);

    int insertSelective(N25175Organ record);

    List<N25175Organ> selectByExample(N25175OrganExample example);

    N25175Organ selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") N25175Organ record, @Param("example") N25175OrganExample example);

    int updateByExample(@Param("record") N25175Organ record, @Param("example") N25175OrganExample example);

    int updateByPrimaryKeySelective(N25175Organ record);

    int updateByPrimaryKey(N25175Organ record);
}