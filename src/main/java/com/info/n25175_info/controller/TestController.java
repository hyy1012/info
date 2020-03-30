package com.info.n25175_info.controller;

import com.alibaba.fastjson.JSONObject;
import com.info.n25175_info.dao.N25175ProblemMapper;
import com.info.n25175_info.dto.ProblemDto;
import com.info.n25175_info.entity.N25175Problem;
import com.info.n25175_info.entity.N25175ProblemExample;
import com.info.n25175_info.service.ProblemService;
import com.info.n25175_info.utils.CaptchaCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;

/**
 * Class Name:com.info.n25175_info.controller TestController
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/11/7 0007 14:43
 * Description: TestController
 * ==========================
 */
@Controller
@RequestMapping("/test")
public class TestController {

    private Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private ProblemService problemService;


    /**
     * 跳转到试题页面
     * @return
     */
    @RequestMapping("toTest")
    public String toTest(){
            return "home/problem";
    }

    /**
     * 添加题目
     */
    @RequestMapping("/add")
    @ResponseBody
    public JSONObject addProblem(@RequestBody  ProblemDto problem){
        System.out.println(problem.toString());
        JSONObject jsonObject = new JSONObject();
        boolean b = problemService.addProblem(problem);
        if (b){
            jsonObject.put("code",200);
            problem.setpDate(new Date());
            jsonObject.put("problem",problem);
        }else{
            jsonObject.put("code",201);
        }
        return jsonObject;
    }

    /**
     * 删除题目
     */
    @RequestMapping("/delete")
    @ResponseBody
    public JSONObject deleteProblem(Integer id){
        JSONObject jsonObject = new JSONObject();
        boolean b = problemService.deleteByID(id);
        if (b){
            jsonObject.put("code",200);
        }else{
            jsonObject.put("code",201);
        }
        return jsonObject;
    }


    /**
     * 编辑题目
     */
    @RequestMapping("/edit")
    @ResponseBody
    public JSONObject editProblem(@RequestBody ProblemDto problem){
        JSONObject jsonObject = new JSONObject();
        problem.setpDate(new Date());
        boolean b = problemService.editByProblemId(problem);
        if (b){
            jsonObject.put("code",200);
            jsonObject.put("problem",problem);
        }else{
            jsonObject.put("code",201);
        }
        return jsonObject;
    }


    /**
     * 获得所有题目
     */
    @RequestMapping("/getAll")
    @ResponseBody
    public JSONObject getAllProblem(Integer id){
        JSONObject jsonObject = new JSONObject();
        List<ProblemDto> allProblem = problemService.getAllProblem(id);
        jsonObject.put("problems",allProblem);
        return jsonObject;
    }


    /**
     * 获得所有题目
     */
    @RequestMapping("/getOne")
    @ResponseBody
    public JSONObject getProblemById(Integer id){
        JSONObject jsonObject = new JSONObject();
        N25175Problem one = problemService.getOne(id);
        jsonObject.put("problem", one);
        return jsonObject;
    }


    @RequestMapping("/change")
    @ResponseBody
    public JSONObject change(Integer id1,Integer id2){
        logger.warn(id1+"===="+id2);
        JSONObject jsonObject = new JSONObject();
        problemService.change(id1,id2);
        jsonObject.put("code",200);
        return jsonObject;
    }


}
