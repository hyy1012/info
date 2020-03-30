package com.info.n25175_info.dao;

import com.info.n25175_info.dto.AVGMoney;
import com.info.n25175_info.entity.N25175Admin;
import com.info.n25175_info.entity.N25175AdminExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface N25175AdminMapper {
    long countByExample(N25175AdminExample example);

    int deleteByExample(N25175AdminExample example);

    int deleteByPrimaryKey(Integer aId);

    int insert(N25175Admin record);

    int insertSelective(N25175Admin record);

    List<N25175Admin> selectByExample(N25175AdminExample example);

    N25175Admin selectByPrimaryKey(Integer aId);

    int updateByExampleSelective(@Param("record") N25175Admin record, @Param("example") N25175AdminExample example);

    int updateByExample(@Param("record") N25175Admin record, @Param("example") N25175AdminExample example);

    int updateByPrimaryKeySelective(N25175Admin record);

    int updateByPrimaryKey(N25175Admin record);

    List<Integer> findAIdsByAStauts(Integer aStatus);

    List<Integer> findAIdsByADepart(Integer aDepart);

    List<Integer> findAIdsExceptAStauts(Integer aStatus);

    //根据id转正
    int updateAStatusByAId(Integer aId, Integer aStatus);

    /**
     * 统计平均月份期望和答题工资
     * @return
     */
    List<AVGMoney> groupMoney();
}