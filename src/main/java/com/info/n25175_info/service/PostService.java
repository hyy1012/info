package com.info.n25175_info.service;

import com.info.n25175_info.entity.N25175Post;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class Name:com.info.n25175_info.service PostService
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/18 0018 16:19
 * Description: PostService
 * ==========================
 */
public interface PostService {
    /**
     * 获得所有的职位信息
     * @return
     */
    List<N25175Post> getAllPost();

    /**
     * 修改
     * @param post
     * @return
     */
    boolean editPost(N25175Post post);

    /**
     * 删除职位
     * @param id
     * @return
     */
    boolean delete(Integer id);


    /**
     * 添加职位
     */
    boolean addPost(N25175Post post);

    /**
     * 获得所有的激活职位信息
     */
    List<N25175Post> getAllActivePost();

    /**
     * 获得所有招聘职位
     */
    List<N25175Post> getAllPostBySelect();


    /**
     * 获得岗位名称
     */
    N25175Post getById(Integer id);

    /**
     * 获得岗位名称
     */
    String getNpNameById(Integer npId);

    /**
     * 获得岗位id
     */
    Integer getIdByNpName(String npName);

    /**
     * 调整用户岗位
     */
    boolean editUserPost(Integer uAid, String name, Integer oPost, Integer nPost);

    /**
     * 查询所有启用岗位分组数量
     */
    Map<String, Integer> groupCount();

}
