package com.info.n25175_info.dto;

import com.info.n25175_info.entity.N25175Response;
import com.info.n25175_info.entity.N25175Submit;

import java.util.List;

/**
 * Class Name:com.info.n25175_info.dto SubmitDto
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/24 0024 9:26
 * Description: SubmitDto
 * ==========================
 */
public class SubmitDto extends N25175Submit {

    List<N25175Response> responses;

    public List<N25175Response> getResponses() {
        return responses;
    }

    public void setResponses(List<N25175Response> responses) {
        this.responses = responses;
    }

    @Override
    public String toString() {
        return "SubmitDto{" +
                "responses=" + responses +
                '}';
    }
}
