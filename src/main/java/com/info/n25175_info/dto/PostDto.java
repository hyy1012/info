package com.info.n25175_info.dto;

import com.info.n25175_info.entity.N25175Answer;
import com.info.n25175_info.entity.N25175Post;
import com.info.n25175_info.entity.N25175Problem;
import com.info.n25175_info.entity.N25175Text;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Class Name:com.info.n25175_info.dto ProblemDto
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/20 0020 8:35
 * Description: ProblemDto
 * ==========================
 */
@Getter
@Setter
public class PostDto extends N25175Post {

    List<N25175Text> texts;


}
