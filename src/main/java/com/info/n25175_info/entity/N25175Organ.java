package com.info.n25175_info.entity;

public class N25175Organ {
    private Integer nId;

    private Integer nPid;

    private String nName;

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public Integer getnPid() {
        return nPid;
    }

    public void setnPid(Integer nPid) {
        this.nPid = nPid;
    }

    public String getnName() {
        return nName;
    }

    public void setnName(String nName) {
        this.nName = nName == null ? null : nName.trim();
    }
}