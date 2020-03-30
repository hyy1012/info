package com.info.n25175_info.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class N25175PersonnelChange {
    private Integer pcId;

    private String pcName;

    private Integer pcType;

    private String pcContent;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone = "GMT+8")
    private Date pcDate;

    public Integer getPcId() {
        return pcId;
    }

    public void setPcId(Integer pcId) {
        this.pcId = pcId;
    }

    public String getPcName() {
        return pcName;
    }

    public void setPcName(String pcName) {
        this.pcName = pcName == null ? null : pcName.trim();
    }

    public Integer getPcType() {
        return pcType;
    }

    public void setPcType(Integer pcType) {
        this.pcType = pcType;
    }

    public String getPcContent() {
        return pcContent;
    }

    public void setPcContent(String pcContent) {
        this.pcContent = pcContent == null ? null : pcContent.trim();
    }

    public Date getPcDate() {
        return pcDate;
    }

    public void setPcDate(Date pcDate) {
        this.pcDate = pcDate;
    }
}