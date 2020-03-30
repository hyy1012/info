package com.info.n25175_info.dao;

import com.info.n25175_info.MyMapper;
import com.info.n25175_info.dto.project.ProjectDto;
import com.info.n25175_info.entity.Project;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectMapper extends MyMapper<Project> {

    ProjectDto newByAid(Integer aId);

    List<ProjectDto> findAllByaId(Integer aId);

    List<ProjectDto> findAllInaIds(List<Integer> aIds);

    List<ProjectDto> findAll();

    ProjectDto findByPCode(String pCode);

    //添加新函数用来获取搜索条件
    List<ProjectDto> selectBypNamepCode(@Param("aId") Integer aId, @Param("pName") String pName,@Param("pCode") String pCode);
}