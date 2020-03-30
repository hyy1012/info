package com.info.n25175_info.dto;

import com.info.n25175_info.entity.N25175Admin;

/**
 * Class Name:com.info.n25175_info.dto AdminDtoOne
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/17 0017 10:40
 * Description: AdminDtoOne
 * ==========================
 */
public class AdminDtoOne extends N25175Admin {

    private String name;

    private String phone;

    private String post;

    private Integer sex;

    private Integer treatment;

    private String uFile;

    private String depart;

    private Integer npId;

    public Integer getNpId() {
        return npId;
    }

    public void setNpId(Integer npId) {
        this.npId = npId;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getuFile() {
        return uFile;
    }

    public void setuFile(String uFile) {
        this.uFile = uFile;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Integer getTreatment() {
        return treatment;
    }

    public void setTreatment(Integer treatment) {
        this.treatment = treatment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "AdminDtoOne{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", post='" + post + '\'' +
                ", sex=" + sex +
                ", treatment=" + treatment +
                '}';
    }
}
