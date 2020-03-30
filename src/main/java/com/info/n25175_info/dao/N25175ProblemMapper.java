package com.info.n25175_info.dao;

import com.info.n25175_info.dto.ProblemDto;
import com.info.n25175_info.entity.N25175ParamExample;
import com.info.n25175_info.entity.N25175Problem;
import com.info.n25175_info.entity.N25175ProblemExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface N25175ProblemMapper {
    long countByExample(N25175ProblemExample example);

    int deleteByExample(N25175ProblemExample example);

    int deleteByPrimaryKey(Integer pId);

    int insert(N25175Problem record);

    int insertSelective(N25175Problem record);

    List<ProblemDto> selectByExample(N25175ProblemExample example);

    List<Integer> selectIdsByPostId(Integer id);

    N25175Problem selectByPrimaryKey(Integer pId);

    int updateByExampleSelective(@Param("record") N25175Problem record, @Param("example") N25175ProblemExample example);

    int updateByExample(@Param("record") N25175Problem record, @Param("example") N25175ProblemExample example);

    int updateByEx(N25175ProblemExample example);

    int updateByPrimaryKeySelective(N25175Problem record);

    int updateByPrimaryKey(N25175Problem record);
}