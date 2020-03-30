package com.info.n25175_info.controller.web;

import com.alibaba.fastjson.JSONObject;
import com.info.n25175_info.dto.SubmitBody;
import com.info.n25175_info.entity.N25175Param;
import com.info.n25175_info.service.ParamService;
import com.info.n25175_info.service.PostService;
import com.info.n25175_info.service.ProblemService;
import com.info.n25175_info.service.SubmitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * Class Name:com.info.n25175_info.controller.web FrontTestController
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/21 0021 17:17
 * Description: FrontTestController
 * ==========================
 */
@RequestMapping("/web_test")
@CrossOrigin
@Controller
public class FrontTestController {


    private Logger logger= LoggerFactory.getLogger(FrontTestController.class);

    @Autowired
    private ProblemService problemService;

    @Autowired
    private SubmitService submitService;





    @RequestMapping("/getProblem")
    @ResponseBody
    public JSONObject getProblem(HttpServletRequest request){
        String token = request.getHeader("token");
        System.out.println(token==null);
        JSONObject allProblemByToken = problemService.getAllProblemByToken(token);
        return allProblemByToken;
    }

    @RequestMapping("/sub")
    @ResponseBody
    public JSONObject sub(HttpServletRequest request, @RequestBody SubmitBody body){
        JSONObject jsonObject = submitService.setRecord(request.getHeader("token"), body);
        System.out.println(body);
        return jsonObject;
    }

}
