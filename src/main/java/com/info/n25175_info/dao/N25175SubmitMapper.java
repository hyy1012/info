package com.info.n25175_info.dao;

import com.info.n25175_info.entity.N25175Submit;
import com.info.n25175_info.entity.N25175SubmitExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface N25175SubmitMapper {
    long countByExample(N25175SubmitExample example);

    int deleteByExample(N25175SubmitExample example);

    int deleteByPrimaryKey(Integer sId);

    int insert(N25175Submit record);

    int insertSelective(N25175Submit record);

    List<N25175Submit> selectByExample(N25175SubmitExample example);

    N25175Submit selectByPrimaryKey(Integer sId);

    int updateByExampleSelective(@Param("record") N25175Submit record, @Param("example") N25175SubmitExample example);

    int updateByExample(@Param("record") N25175Submit record, @Param("example") N25175SubmitExample example);

    int updateByPrimaryKeySelective(N25175Submit record);

    int updateByPrimaryKey(N25175Submit record);
}