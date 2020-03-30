package com.info.n25175_info.service;

import com.alibaba.fastjson.JSONObject;
import com.info.n25175_info.dto.project.ProjectDto;
import com.info.n25175_info.entity.Project;

import java.text.ParseException;
import java.util.List;

public interface ProjectService {

    ProjectDto newByAid(Integer aid) throws ParseException;

    ProjectDto findByPCode(String pCode);

    void save(Project project);

    JSONObject commit(Project project);

    int shenpiUpdate(String idea, Boolean isFirst, Integer status, String pCode);

    List<ProjectDto> findListByuAid(Integer id);

    List<ProjectDto> findAllInaIds(Integer aDepart, Integer page, Integer limit);

    List<ProjectDto> findAll();

}
