package com.info.n25175_info.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.info.n25175_info.dao.N25175AdminMapper;
import com.info.n25175_info.dao.ProjectMapper;
import com.info.n25175_info.dto.project.ProjectDto;
import com.info.n25175_info.entity.Project;
import com.info.n25175_info.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectMapper projectMapper;

    @Autowired
    private N25175AdminMapper adminMapper;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public ProjectDto newByAid(Integer aid) throws ParseException {
        ProjectDto projectDto = projectMapper.newByAid(aid);
        String sDate = sdf.format(new Date());
        int count = selectNum(sDate);
        String pCode = "BW" + sDate + count;
        projectDto.setpCode(pCode);
        return projectDto;
    }


    @Override
    public ProjectDto findByPCode(String pCode) {
        ProjectDto projectDto = projectMapper.findByPCode(pCode);
        projectDto.setSTime(sdf2.format(projectDto.getStartTime()));
        projectDto.setETime(sdf2.format(projectDto.getEndTime()));
        Date pdCheck = projectDto.getPdCheck();
        if (pdCheck != null){
            projectDto.setPdChecks(sdf2.format(pdCheck));
        }
        Date pcCheck = projectDto.getPcCheck();
        if (pcCheck != null) {
            projectDto.setPcChecks(sdf2.format(pcCheck));
        }
        return projectDto;
    }

    @Override
    public void save(Project project) {
        int insert = projectMapper.insert(project);
        System.out.println(insert);
    }

    @Override
    public JSONObject commit(Project project) {
        JSONObject jsonObject = new JSONObject();
        int code = selectCode(project.getpCode());
        if (code > 0){
            jsonObject.put("code", 500);
            jsonObject.put("msg", "提交失败, 项目编号已存在");
            return jsonObject;
        }
        project.setCreateTime(new Date());
        project.setStatus(1);
        int i = projectMapper.insert(project);
        if (i == 0){
            jsonObject.put("code", 500);
            jsonObject.put("msg", "提交失败, 未知错误");
            return jsonObject;
        }
        jsonObject.put("code", 200);
        jsonObject.put("msg", "提交成功");
        return jsonObject;
    }

    @Override
    public JSONObject afreshCommit(Project project) {
        JSONObject jsonObject = new JSONObject();
        int code = selectCode(project.getpCode());
        if (code != 1){
            jsonObject.put("code", 500);
            jsonObject.put("msg", "提交失败, 项目编号不存在");
            return jsonObject;
        }
        project.setStatus(1);
        Example example = new Example(Project.class);
        example.createCriteria().andEqualTo("pCode", project.getpCode());
        int i = projectMapper.updateByExampleSelective(project, example);
        if (i == 0){
            jsonObject.put("code", 500);
            jsonObject.put("msg", "提交失败, 未知错误");
            return jsonObject;
        }
        jsonObject.put("code", 200);
        jsonObject.put("msg", "提交成功");
        return jsonObject;
    }

    @Override
    public int shenpiUpdate(String idea, Boolean isFirst, Integer status, String pCode) {
        Example example = new Example(Project.class);
        example.createCriteria().andEqualTo("pCode", pCode);
        Project project = new Project();
        project.setStatus(status);
        if (isFirst){
            project.setFidea(idea);
            project.setPdCheck(new Date());
        }else {
            project.setEidea(idea);
            project.setPcCheck(new Date());
        }
        int i = projectMapper.updateByExampleSelective(project, example);
        return i;
    }

    @Override
    public List<ProjectDto> findListByuAid(Integer id) {
//        Example example = new Example(Project.class);
//        Example.Criteria criteria = example.createCriteria();
//        criteria.andEqualTo("uAid", id);
//        List<Project> projects = projectMapper.selectByExample(example);
        List<ProjectDto> projects = projectMapper.findAllByaId(id);
        return projects;
    }

    @Override
    public List<ProjectDto> findAllInaIds(Integer aDepart, Integer page, Integer limit) {
        List<Integer> aIds = adminMapper.findAIdsByADepart(aDepart);
        PageHelper.startPage(page, limit);
        List<ProjectDto> projects = projectMapper.findAllInaIds(aIds);
        return projects;
    }

    @Override
    public List<ProjectDto> findAll() {
        List<ProjectDto> projects = projectMapper.findAll();
        return projects;
    }

    /**
     * 修改人：bill
     * 描述：添加了selectBypNamepCode
     * **/
    @Override
    public List<ProjectDto> selectBypNamepCode(Integer aId,String pName,String pCode){
        List<ProjectDto> projects = projectMapper.selectBypNamepCode(aId,pName,pCode);
        return projects;
    }

    public int selectNum(String sDate) throws ParseException {
        Date date = sdf.parse(sDate);
        Example example = new Example(Project.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("createTime", date);
        int count = projectMapper.selectCountByExample(example);
        return count;
    }

    public int selectCode(String code){
        Example example = new Example(Project.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("pCode", code);
        int count = projectMapper.selectCountByExample(example);
        return count;
    }

}
