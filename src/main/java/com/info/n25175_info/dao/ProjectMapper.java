package com.info.n25175_info.dao;

import com.info.n25175_info.MyMapper;
import com.info.n25175_info.dto.project.ProjectDto;
import com.info.n25175_info.entity.Project;

import java.util.List;

public interface ProjectMapper extends MyMapper<Project> {

    ProjectDto newByAid(Integer aId);

    List<ProjectDto> findAllByaId(Integer aId);

    List<ProjectDto> findAllInaIds(List<Integer> aIds);

    List<ProjectDto> findAll();

    ProjectDto findByPCode(String pCode);
}