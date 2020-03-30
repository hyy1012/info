package com.info.n25175_info.dao;

import com.info.n25175_info.entity.N25175User;
import com.info.n25175_info.entity.N25175UserExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface N25175UserMapper {
    long countByExample(N25175UserExample example);

    int deleteByExample(N25175UserExample example);

    int deleteByPrimaryKey(Integer uId);

    int insert(N25175User record);

    int insertSelective(N25175User record);

    List<N25175User> selectByExample(N25175UserExample example);

    List<N25175User> selectByMonth();

    N25175User selectByPrimaryKey(Integer uId);

    int updateByExampleSelective(@Param("record") N25175User record, @Param("example") N25175UserExample example);

    int updateByExample(@Param("record") N25175User record, @Param("example") N25175UserExample example);

    int updateByPrimaryKeySelective(N25175User record);

    int updateByPrimaryKey(N25175User record);
}