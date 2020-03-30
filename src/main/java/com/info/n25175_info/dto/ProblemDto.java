package com.info.n25175_info.dto;

import com.info.n25175_info.entity.N25175Answer;
import com.info.n25175_info.entity.N25175Problem;

import java.util.List;

/**
 * Class Name:com.info.n25175_info.dto ProblemDto
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/20 0020 8:35
 * Description: ProblemDto
 * ==========================
 */
public class ProblemDto extends N25175Problem {

    List<N25175Answer> answers;

    public List<N25175Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<N25175Answer> answers) {
        this.answers = answers;
    }

}
