package com.info.n25175_info.dao;

import com.info.n25175_info.entity.N25175UserEnable;
import com.info.n25175_info.entity.N25175UserEnableExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface N25175UserEnableMapper {
    long countByExample(N25175UserEnableExample example);

    int deleteByExample(N25175UserEnableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(N25175UserEnable record);

    int insertSelective(N25175UserEnable record);

    List<N25175UserEnable> selectByExample(N25175UserEnableExample example);

    N25175UserEnable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") N25175UserEnable record, @Param("example") N25175UserEnableExample example);

    int updateByExample(@Param("record") N25175UserEnable record, @Param("example") N25175UserEnableExample example);

    int updateByPrimaryKeySelective(N25175UserEnable record);

    int updateByPrimaryKey(N25175UserEnable record);
}