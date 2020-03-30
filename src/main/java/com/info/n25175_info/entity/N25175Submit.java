package com.info.n25175_info.entity;

public class N25175Submit {
    private Integer sId;

    private Integer sAid;

    private String sName;

    private Integer sMark;

    private Integer sScore;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getsAid() {
        return sAid;
    }

    public void setsAid(Integer sAid) {
        this.sAid = sAid;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public Integer getsMark() {
        return sMark;
    }

    public void setsMark(Integer sMark) {
        this.sMark = sMark;
    }

    public Integer getsScore() {
        return sScore;
    }

    public void setsScore(Integer sScore) {
        this.sScore = sScore;
    }


    @Override
    public String toString() {
        return "N25175Submit{" +
                "sId=" + sId +
                ", sAid=" + sAid +
                ", sName='" + sName + '\'' +
                ", sMark=" + sMark +
                ", sScore=" + sScore +
                '}';
    }
}