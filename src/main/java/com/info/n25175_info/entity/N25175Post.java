package com.info.n25175_info.entity;

public class N25175Post {
    private Integer npId;

    private String npName;

    private Integer npSign;

    public Integer getNpId() {
        return npId;
    }

    public void setNpId(Integer npId) {
        this.npId = npId;
    }

    public String getNpName() {
        return npName;
    }

    public void setNpName(String npName) {
        this.npName = npName == null ? null : npName.trim();
    }

    public Integer getNpSign() {
        return npSign;
    }

    public void setNpSign(Integer npSign) {
        this.npSign = npSign;
    }
}