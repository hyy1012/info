package com.info.n25175_info.controller.project;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.info.n25175_info.dto.project.ProjectDto;
import com.info.n25175_info.entity.N25175Admin;
import com.info.n25175_info.entity.Project;
import com.info.n25175_info.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.List;

@Controller
@RequestMapping("/project")
public class ProjectController {

    public static final Integer fy = 2; //初审通过
    public static final Integer fn = 4; //初审驳回
    public static final Integer ey = 3; //最终审核通过
    public static final Integer en = 5; //最终审核驳回

    @Autowired
    private ProjectService projectService;

    @RequestMapping("/to_list")
    public String toList(){
        return "project/projectList";
    }

    @RequestMapping("/to_pi")
    public String toIp(){
        return "project/projectInfo";
    }

    @RequestMapping("/newp")
    public String newProject(Integer uAid, Model model) throws ParseException {
        ProjectDto projectDto = projectService.newByAid(uAid);
        System.out.println(projectDto);
        model.addAttribute("p", projectDto);
        return "project/projectInfo";
    }

    @RequestMapping("/save")
    public void save(Project project){
        projectService.save(project);
    }

    @RequestMapping("/commit")
    @ResponseBody
    public JSONObject commit(Project project){
        JSONObject jsonObject = projectService.commit(project);
        return jsonObject;
    }

    @RequestMapping("/afresh_commit")
    @ResponseBody
    public JSONObject afreshCommit(Project project){
        JSONObject jsonObject = projectService.afreshCommit(project);
        return jsonObject;
    }

    @RequestMapping("/check")
    @ResponseBody
    public JSONObject check(String fideay, String fidean, String eideay, String eidean, String pCode){
        JSONObject jsonObject = new JSONObject();
        int i = 0;
        boolean isFirst = true;
        if (fideay != null) {
            i = projectService.shenpiUpdate(fideay, isFirst, fy, pCode);
            jsonObject.put("msg", "已通过审核");
        }else if (fidean != null) {
            i = projectService.shenpiUpdate(fidean, isFirst, fn, pCode);
            jsonObject.put("msg", "已驳回申请");
        }else if (eideay != null) {
            isFirst = false;
            i = projectService.shenpiUpdate(eideay, isFirst, ey, pCode);
            jsonObject.put("msg", "已通过审核");
        }else if (eidean != null) {
            isFirst = false;
            i = projectService.shenpiUpdate(eidean, isFirst, en, pCode);
            jsonObject.put("msg", "已驳回申请");
        }
        if (i > 0){
            jsonObject.put("code", 200);
        }else{
            jsonObject.put("code", 501);
        }
        return jsonObject;
    }

    @RequestMapping("/item")
    public String showItem(String pCode, Model model){
        ProjectDto projectDto = projectService.findByPCode(pCode);
        model.addAttribute("p", projectDto);
        return "project/projectInfo";
    }

    /**
     * 修改了状态4中的函数调用，添加了新的参数
     * **/
    @RequestMapping("/getList")
    @ResponseBody
    public JSONObject getList(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer limit,
                              Integer id,@RequestParam(defaultValue = "") String pName ,@RequestParam(defaultValue = "") String pCode, HttpSession session){
        JSONObject jsonObject = new JSONObject();
        N25175Admin admin = (N25175Admin) session.getAttribute("user");
        List<ProjectDto> list = null;
        if (admin.getaStatus() == 4){
            // 安全起见要放在if里面
            PageHelper.startPage(page, limit);
            if( pName.equals("") && pCode.equals("") )
                list = projectService.findListByuAid(id);
            else
                list = projectService.selectBypNamepCode(id,pName,pCode);
        }
        if (admin.getaStatus() == 5){
            list = projectService.findAllInaIds(admin.getaDepart(), page, limit);
        }
        if (admin.getaStatus() == 6){
            PageHelper.startPage(page, limit);
            list = projectService.findAll();
        }
        PageInfo info = new PageInfo(list);
        jsonObject.put("code", 0);
        jsonObject.put("count", info.getTotal());
        jsonObject.put("msg", "");
        jsonObject.put("data", list);
        return jsonObject;
    }


}
