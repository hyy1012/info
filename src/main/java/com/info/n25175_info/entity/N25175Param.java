package com.info.n25175_info.entity;

public class N25175Param {
    private Integer pId;

    private String pName;

    private Integer pValue;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public Integer getpValue() {
        return pValue;
    }

    public void setpValue(Integer pValue) {
        this.pValue = pValue;
    }
}