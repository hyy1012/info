package com.info.n25175_info.dao;

import com.info.n25175_info.entity.N25175Param;
import com.info.n25175_info.entity.N25175ParamExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface N25175ParamMapper {
    long countByExample(N25175ParamExample example);

    int deleteByExample(N25175ParamExample example);

    int deleteByPrimaryKey(Integer pId);

    int insert(N25175Param record);

    int insertSelective(N25175Param record);

    List<N25175Param> selectByExample(N25175ParamExample example);

    N25175Param selectByPrimaryKey(Integer pId);

    int updateByExampleSelective(@Param("record") N25175Param record, @Param("example") N25175ParamExample example);

    int updateByExample(@Param("record") N25175Param record, @Param("example") N25175ParamExample example);

    int updateByPrimaryKeySelective(N25175Param record);

    int updateByPrimaryKey(N25175Param record);
}