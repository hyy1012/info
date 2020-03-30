package com.info.n25175_info.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.info.n25175_info.dao.*;
import com.info.n25175_info.dto.ProblemDto;
import com.info.n25175_info.entity.*;
import com.info.n25175_info.service.ParamService;
import com.info.n25175_info.service.ProblemService;
import com.info.n25175_info.utils.Des;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Name:com.info.n25175_info.service.impl ProblemServiceImpl
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/20 0020 9:25
 * Description: ProblemServiceImpl
 * ==========================
 */
@Service
public class ProblemServiceImpl implements ProblemService {

    private Logger logger = LoggerFactory.getLogger(PostServiceImpl.class);

    @Autowired
    private N25175ProblemMapper n25175ProblemMapper;

    @Autowired
    private N25175AnswerMapper n25175AnswerMapper;

    @Autowired
    private N25175AdminMapper n25175AdminMapper;

    @Autowired
    private N25175SubmitMapper n25175SubmitMapper;

    @Autowired
    private N25175UserMapper n25175UserMapper;

    @Autowired
    private ParamService paramService;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<ProblemDto> getAllProblem(Integer id) {
        N25175ProblemExample n25175ProblemExample = new N25175ProblemExample();
        n25175ProblemExample.setOrderByClause("p_list, p_id");
        n25175ProblemExample.createCriteria().andPPostidEqualTo(id);
        List<ProblemDto> n25175Problems = n25175ProblemMapper.selectByExample(n25175ProblemExample);
        return n25175Problems;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public JSONObject change(Integer id1, Integer id2) {
        N25175Problem problem = n25175ProblemMapper.selectByPrimaryKey(id1);
        N25175Problem problem1 = n25175ProblemMapper.selectByPrimaryKey(id2);
        int a = problem.getpList();
        problem.setpList(problem1.getpList());
        problem1.setpList(a);
        n25175ProblemMapper.updateByPrimaryKeySelective(problem);
        n25175ProblemMapper.updateByPrimaryKeySelective(problem1);

        return new JSONObject();
    }

    @Override
    @Transactional
    public boolean deleteByID(Integer id) {
        System.out.println(id);
        n25175ProblemMapper.deleteByPrimaryKey(id);
        N25175AnswerExample n25175AnswerExample = new N25175AnswerExample();
        n25175AnswerExample.createCriteria().andNaProblemidEqualTo(id);
        int i = n25175AnswerMapper.deleteByExample(n25175AnswerExample);
        return true;
    }

    @Override
    @Transactional
    public boolean deleteByProblemId(Integer id) {
        List<Integer> ids = n25175ProblemMapper.selectIdsByPostId(id);
        for (Integer i : ids){
            deleteByID(i);
        }
        return true;
    }

    @Override
    @Transactional
    public boolean editByProblemId(ProblemDto problem) {
        List<N25175Answer> answers = problem.getAnswers();
        N25175AnswerExample n25175AnswerExample = new N25175AnswerExample();
        n25175AnswerExample.createCriteria().andNaProblemidEqualTo(problem.getpId());
         n25175AnswerMapper.deleteByExample(n25175AnswerExample);
         int sum = 0;
        for (N25175Answer answer:answers){
            answer.setNaProblemid(problem.getpId());
            Integer naScore = answer.getNaScore();
            n25175AnswerMapper.insertSelective(answer);
            if (naScore==null){
                naScore=0;
            }
            if (problem.getpType()==1){
                if (naScore>sum){
                    sum=naScore;
                }
            }else{
                sum +=naScore;
            }
        }
        problem.setpScore(sum);
        int i =n25175ProblemMapper.updateByPrimaryKeySelective(problem);
        if (i>0){
            return true;
        }
        return false;
    }

    @Override
    @Transactional
    public boolean addProblem(ProblemDto problem) {
        List<N25175Answer> answers = problem.getAnswers();
        if (problem.getpList()==null){
            N25175ProblemExample n25175ProblemExample = new N25175ProblemExample();
            n25175ProblemExample.setOrderByClause("p_list DESC");
            n25175ProblemExample.createCriteria().andPPostidEqualTo(problem.getpPostid());
            List<ProblemDto> problemDtos = n25175ProblemMapper.selectByExample(n25175ProblemExample);
            if (problemDtos.size()>0){
                problem.setpList(problemDtos.get(0).getpList()+1);
            }else{
                problem.setpList(1);
            }
        }else {
            problem.setpList(problem.getpList()+1);
        }
        N25175ProblemExample n25175ProblemExample = new N25175ProblemExample();
        n25175ProblemExample.createCriteria().andPPostidEqualTo(problem.getpPostid()).andPListGreaterThanOrEqualTo(problem.getpList());
         n25175ProblemMapper.updateByEx(n25175ProblemExample);
        n25175ProblemMapper.insertSelective(problem);
        int sum = 0;
        for (N25175Answer answer:answers){
            answer.setNaProblemid(problem.getpId());
            n25175AnswerMapper.insertSelective(answer);
            Integer naScore = answer.getNaScore();
            if (naScore==null){
                naScore=0;
            }
            if (problem.getpType()==1){
                if (naScore>sum){
                    sum=naScore;
                }
            }else{
                sum +=naScore;
            }
        }
       problem.setpScore(sum);
        n25175ProblemMapper.updateByPrimaryKeySelective(problem);
        return true;
    }


    @Override
    @Transactional
    public N25175Problem getOne(Integer id) {
        N25175Problem problem = n25175ProblemMapper.selectByPrimaryKey(id);
        return problem;
    }


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public JSONObject getAllProblemByToken(String token) {
        JSONObject jsonObject = new JSONObject();
        System.out.println(token==null);
        if (token==null){
            jsonObject.put("code",201);
            return jsonObject;
        }
        String decrypt = Des.decrypt(Des.DesPassword, token);
        String[] split = decrypt.split("-");
        if (split.length==2){
            N25175AdminExample n25175AdminExample = new N25175AdminExample();
            n25175AdminExample.createCriteria().andAUsernameEqualTo(split[1]);
            List<N25175Admin> n25175Admins = n25175AdminMapper.selectByExample(n25175AdminExample);
            if (n25175Admins.size()>0){
                N25175SubmitExample n25175SubmitExample = new N25175SubmitExample();
                n25175SubmitExample.createCriteria().andSAidEqualTo(n25175Admins.get(0).getaId());
                List<N25175Submit> n25175Submits = n25175SubmitMapper.selectByExample(n25175SubmitExample);
                if (n25175Submits.size()<=0){
                    N25175UserExample n25175UserExample = new N25175UserExample();
                    n25175UserExample.createCriteria().andUAidEqualTo(n25175Admins.get(0).getaId());
                    List<N25175User> n25175Users = n25175UserMapper.selectByExample(n25175UserExample);
                    if (n25175Users.size()>0){
                        N25175ProblemExample n25175ProblemExample = new N25175ProblemExample();
                        n25175ProblemExample.setOrderByClause("p_list,p_id");
                        n25175ProblemExample.createCriteria().andPPostidEqualTo(n25175Users.get(0).getuPost());
                        List<ProblemDto> problemDtos = n25175ProblemMapper.selectByExample(n25175ProblemExample);
                        jsonObject.put("code",200);
                        jsonObject.put("problem",problemDtos);

                    }else{
                        jsonObject.put("code",203);
                    }

                }else{
                    jsonObject.put("code",202);
                    N25175Param markToPrice = paramService.getParamByString("markToPrice");
                    Integer integer = markToPrice.getpValue();
                   jsonObject.put("mark",n25175Admins.get(0).getaSum());
                   int sum = integer * Integer.parseInt(n25175Admins.get(0).getaSum().split("/")[0]);
                   jsonObject.put("maybe",sum);
                }


            }else{
                jsonObject.put("code",201);
            }
        }else{
            jsonObject.put("code",201);
        }
        return jsonObject;
    }
}
