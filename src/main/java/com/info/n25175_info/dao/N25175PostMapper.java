package com.info.n25175_info.dao;

import com.info.n25175_info.entity.N25175Post;
import com.info.n25175_info.entity.N25175PostExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface N25175PostMapper {
    long countByExample(N25175PostExample example);

    int deleteByExample(N25175PostExample example);

    int deleteByPrimaryKey(Integer npId);

    int insert(N25175Post record);

    int insertSelective(N25175Post record);

    List<N25175Post> selectByExample(N25175PostExample example);

    N25175Post selectByPrimaryKey(Integer npId);

    int updateByExampleSelective(@Param("record") N25175Post record, @Param("example") N25175PostExample example);

    int updateByExample(@Param("record") N25175Post record, @Param("example") N25175PostExample example);

    int updateByPrimaryKeySelective(N25175Post record);

    int updateByPrimaryKey(N25175Post record);

    List<Map<String, Object>> groupCount();
}