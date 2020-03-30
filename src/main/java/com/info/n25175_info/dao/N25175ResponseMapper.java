package com.info.n25175_info.dao;

import com.info.n25175_info.entity.N25175Response;
import com.info.n25175_info.entity.N25175ResponseExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface N25175ResponseMapper {
    long countByExample(N25175ResponseExample example);

    int deleteByExample(N25175ResponseExample example);

    int deleteByPrimaryKey(Integer rId);

    int insert(N25175Response record);

    int insertSelective(N25175Response record);

    List<N25175Response> selectByExample(N25175ResponseExample example);

    N25175Response selectByPrimaryKey(Integer rId);

    int updateByExampleSelective(@Param("record") N25175Response record, @Param("example") N25175ResponseExample example);

    int updateByExample(@Param("record") N25175Response record, @Param("example") N25175ResponseExample example);

    int updateByPrimaryKeySelective(N25175Response record);

    int updateByPrimaryKey(N25175Response record);
}