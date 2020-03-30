package com.info.n25175_info.dao;

import com.info.n25175_info.entity.N25175Answer;
import com.info.n25175_info.entity.N25175AnswerExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface N25175AnswerMapper {
    long countByExample(N25175AnswerExample example);

    int deleteByExample(N25175AnswerExample example);

    int deleteByPrimaryKey(Integer naId);

    int insert(N25175Answer record);

    int insertSelective(N25175Answer record);

    List<N25175Answer> selectByExample(N25175AnswerExample example);

    N25175Answer selectByPrimaryKey(Integer naId);

    int updateByExampleSelective(@Param("record") N25175Answer record, @Param("example") N25175AnswerExample example);

    int updateByExample(@Param("record") N25175Answer record, @Param("example") N25175AnswerExample example);

    int updateByPrimaryKeySelective(N25175Answer record);

    int updateByPrimaryKey(N25175Answer record);
}