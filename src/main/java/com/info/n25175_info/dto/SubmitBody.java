package com.info.n25175_info.dto;

import java.util.List;

/**
 * Class Name:com.info.n25175_info.dto SubmitBody
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/24 0024 9:23
 * Description: SubmitBody
 * ==========================
 */
public class SubmitBody {

    List<SubmitDto> subs;

    public List<SubmitDto> getSubs() {
        return subs;
    }

    public void setSubs(List<SubmitDto> subs) {
        this.subs = subs;
    }

    @Override
    public String toString() {
        return "SubmitBody{" +
                "subs=" + subs +
                '}';
    }
}
