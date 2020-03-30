package com.info.n25175_info.service.impl;

import com.info.n25175_info.dao.N25175AnswerMapper;
import com.info.n25175_info.dao.N25175PostMapper;
import com.info.n25175_info.dao.N25175ProblemMapper;
import com.info.n25175_info.dao.N25175UserMapper;
import com.info.n25175_info.dto.ProblemDto;
import com.info.n25175_info.entity.*;
import com.info.n25175_info.service.PersonalChangeService;
import com.info.n25175_info.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class Name:com.info.n25175_info.service.impl PostServiceImpl
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/18 0018 16:19
 * Description: PostServiceImpl
 * ==========================
 */
@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private N25175PostMapper n25175PostMapper ;

    @Autowired
    private N25175ProblemMapper n25175ProblemMapper ;

    @Autowired
    private N25175AnswerMapper n25175AnswerMapper ;

    @Autowired
    private N25175UserMapper n25175UserMapper;

    @Autowired
    private PersonalChangeService personalChangeService;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<N25175Post> getAllPost() {
        List<N25175Post> n25175Posts = n25175PostMapper.selectByExample(new N25175PostExample());
        return n25175Posts;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<N25175Post> getAllActivePost() {
        N25175PostExample n25175PostExample = new N25175PostExample();
        n25175PostExample.createCriteria().andNpSignEqualTo(1);
        List<N25175Post> n25175Posts = n25175PostMapper.selectByExample(n25175PostExample);
        return n25175Posts;
    }

    @Override
    @Transactional
    public boolean editPost(N25175Post post) {
        if (post.getNpName()!=null){
            N25175PostExample n25175PostExample = new N25175PostExample();
            n25175PostExample.createCriteria().andNpNameEqualTo(post.getNpName()).andNpIdNotEqualTo(post.getNpId());
            List<N25175Post> n25175Posts = n25175PostMapper.selectByExample(n25175PostExample);
            if (n25175Posts.size()>0){
                return false;
            }
        }
        int i = n25175PostMapper.updateByPrimaryKeySelective(post);
        if (i>0){
            return true;
        }
        return false;
    }

    @Override
    @Transactional
    public boolean delete(Integer id) {
        N25175ProblemExample n25175ProblemExample = new N25175ProblemExample();
        n25175ProblemExample.createCriteria().andPPostidEqualTo(id);
        List<ProblemDto> n25175Problems = n25175ProblemMapper.selectByExample(n25175ProblemExample);
        n25175ProblemMapper.deleteByExample(n25175ProblemExample);
        List<Integer> list = new ArrayList<>();
        for (ProblemDto problem:n25175Problems){
          list.add(problem.getpId());
        }
        if (list.size()>0){
            N25175AnswerExample n25175AnswerExample = new N25175AnswerExample();
            n25175AnswerExample.createCriteria().andNaProblemidIn(list);
            n25175AnswerMapper.deleteByExample(n25175AnswerExample);
        }
        n25175PostMapper.deleteByPrimaryKey(id);
        return true;
    }


    @Override
    @Transactional
    public boolean addPost(N25175Post post) {
        N25175PostExample n25175PostExample = new N25175PostExample();
        n25175PostExample.createCriteria().andNpNameEqualTo(post.getNpName());
        List<N25175Post> n25175Posts = n25175PostMapper.selectByExample(n25175PostExample);
        if (n25175Posts.size()>0){
            return false;
        }
        post.setNpSign(1);
        int insertSelective = n25175PostMapper.insertSelective(post);
        if (insertSelective>0){
            return true;
        }
        return false;
    }


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<N25175Post> getAllPostBySelect() {
        N25175PostExample n25175PostExample = new N25175PostExample();
        n25175PostExample.createCriteria().andNpSignEqualTo(1);
        List<N25175Post> n25175Posts = n25175PostMapper.selectByExample(n25175PostExample);
        return n25175Posts;
    }


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public N25175Post getById(Integer id) {
        N25175Post n25175Post = n25175PostMapper.selectByPrimaryKey(id);
        return n25175Post;
    }

    @Override
    public Integer getIdByNpName(String npName) {
        try {
            String sql = "select np_id from n25175_post WHERE np_name = ?";
            return jdbcTemplate.queryForObject(sql, Integer.class, npName);
        }catch (Exception e){
            return 0;
        }
    }

    @Override
    public String getNpNameById(Integer npId) {
        try {
            String sql = "select np_name from n25175_post WHERE np_id = ?";
            return jdbcTemplate.queryForObject(sql, String.class, npId);
        }catch (Exception e){
            return "";
        }
    }

    @Override
    public boolean editUserPost(Integer uAid, String name, Integer oPost, Integer nPost) {
        N25175User user = new N25175User();
        user.setuPost(nPost);
        N25175UserExample n25175UserExample = new N25175UserExample();
        n25175UserExample.createCriteria().andUAidEqualTo(uAid);
        int i = n25175UserMapper.updateByExampleSelective(user,n25175UserExample);
        personalChangeService.addRecord(name, null, null, oPost, nPost, null, null);
        if (i == 1)
            return true;
        else
            return false;
    }

    @Override
    public Map<String, Integer> groupCount() {
        List<Map<String, Object>> list = n25175PostMapper.groupCount();
        Map<String, Integer> map = new HashMap<>();
        for (Map<String, Object> m : list){
            map.put(m.get("name").toString(), Integer.valueOf(m.get("count").toString()));
        }
        return map;
    }
}
