package com.info.n25175_info.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class N25175Admin {
    private Integer aId;

    private String aUsername;

    private String aPassword;

    private Integer aJnum;

    private Integer aRole;

    private Integer aStatus;

    private Integer aEdit;

    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
    private Date aDate;

    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
    private Date aSubtime;

    private String aSum;

    private Integer aSub;

    private Integer aDepart;

    public Integer getaDepart() {
        return aDepart;
    }

    public void setaDepart(Integer aDepart) {
        this.aDepart = aDepart;
    }

    public Integer getaJnum() {
        return aJnum;
    }

    public void setaJnum(Integer aJnum) {
        this.aJnum = aJnum;
    }

    public Integer getaSub() {
        return aSub;
    }

    public void setaSub(Integer aSub) {
        this.aSub = aSub;
    }

    public String getaSum() {
        return aSum;
    }

    public void setaSum(String aSum) {
        this.aSum = aSum;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaUsername() {
        return aUsername;
    }

    public void setaUsername(String aUsername) {
        this.aUsername = aUsername == null ? null : aUsername.trim();
    }

    public String getaPassword() {
        return aPassword;
    }

    public void setaPassword(String aPassword) {
        this.aPassword = aPassword == null ? null : aPassword.trim();
    }

    public Integer getaRole() {
        return aRole;
    }

    public void setaRole(Integer aRole) {
        this.aRole = aRole;
    }

    public Integer getaStatus() {
        return aStatus;
    }

    public void setaStatus(Integer aStatus) {
        this.aStatus = aStatus;
    }

    public Integer getaEdit() {
        return aEdit;
    }

    public void setaEdit(Integer aEdit) {
        this.aEdit = aEdit;
    }

    public Date getaDate() {
        return aDate;
    }

    public void setaDate(Date aDate) {
        this.aDate = aDate;
    }

    public Date getaSubtime() {
        return aSubtime;
    }

    public void setaSubtime(Date aSubtime) {
        this.aSubtime = aSubtime;
    }


    @Override
    public String toString() {
        return "N25175Admin{" +
                "aId=" + aId +
                ", aUsername='" + aUsername + '\'' +
                ", aPassword='" + aPassword + '\'' +
                ", aRole=" + aRole +
                ", aStatus=" + aStatus +
                ", aEdit=" + aEdit +
                ", aDate=" + aDate +
                ", aSubtime=" + aSubtime +
                '}';
    }
}