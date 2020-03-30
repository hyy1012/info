package com.info.n25175_info.entity;

public class N25175Answer {
    private Integer naId;

    private String naAnswer;

    private Integer naScore;

    private Integer naProblemid;

    public Integer getNaId() {
        return naId;
    }

    public void setNaId(Integer naId) {
        this.naId = naId;
    }

    public String getNaAnswer() {
        return naAnswer;
    }

    public void setNaAnswer(String naAnswer) {
        this.naAnswer = naAnswer == null ? null : naAnswer.trim();
    }

    public Integer getNaScore() {
        return naScore;
    }

    public void setNaScore(Integer naScore) {
        this.naScore = naScore;
    }

    public Integer getNaProblemid() {
        return naProblemid;
    }

    public void setNaProblemid(Integer naProblemid) {
        this.naProblemid = naProblemid;
    }


    @Override
    public String toString() {
        return "N25175Answer{" +
                "naId=" + naId +
                ", naAnswer='" + naAnswer + '\'' +
                ", naScore=" + naScore +
                ", naProblemid=" + naProblemid +
                '}';
    }
}