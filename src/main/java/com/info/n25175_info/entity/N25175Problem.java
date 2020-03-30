package com.info.n25175_info.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class N25175Problem {
    private Integer pId;

    private String pTopic;

    private Integer pType;

    private Integer pList;

    private Integer pPostid;

    private Integer pScore;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone = "GMT+8")
    private Date pDate;

    private Integer pSign;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpTopic() {
        return pTopic;
    }

    public void setpTopic(String pTopic) {
        this.pTopic = pTopic == null ? null : pTopic.trim();
    }

    public Integer getpType() {
        return pType;
    }

    public void setpType(Integer pType) {
        this.pType = pType;
    }

    public Integer getpList() {
        return pList;
    }

    public void setpList(Integer pList) {
        this.pList = pList;
    }

    public Integer getpPostid() {
        return pPostid;
    }

    public void setpPostid(Integer pPostid) {
        this.pPostid = pPostid;
    }

    public Integer getpScore() {
        return pScore;
    }

    public void setpScore(Integer pScore) {
        this.pScore = pScore;
    }

    public Date getpDate() {
        return pDate;
    }

    public void setpDate(Date pDate) {
        this.pDate = pDate;
    }

    public Integer getpSign() {
        return pSign;
    }

    public void setpSign(Integer pSign) {
        this.pSign = pSign;
    }
}