package com.info.n25175_info.entity;

public class N25175Response {
    private Integer rId;

    private String rResponse;

    private Integer rSubmitid;

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrResponse() {
        return rResponse;
    }

    public void setrResponse(String rResponse) {
        this.rResponse = rResponse == null ? null : rResponse.trim();
    }

    public Integer getrSubmitid() {
        return rSubmitid;
    }

    public void setrSubmitid(Integer rSubmitid) {
        this.rSubmitid = rSubmitid;
    }


    @Override
    public String toString() {
        return "N25175Response{" +
                "rId=" + rId +
                ", rResponse='" + rResponse + '\'' +
                ", rSubmitid=" + rSubmitid +
                '}';
    }
}