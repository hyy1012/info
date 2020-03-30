package com.info.n25175_info.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import javax.persistence.*;

@Data
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 项目编号
     */
    @Column(name = "p_code")
    private String pCode;

    /**
     * 员工id
     */
    @Column(name = "u_aid")
    private Integer uAid;

    /**
     * 部门id
     */
    @Column(name = "d_id")
    private Integer dId;

    /**
     * 项目名称
     */
    @Column(name = "p_name")
    private String pName;

    /**
     * 0 已保存
            1 已提交
            2 初审通过
            3 终审通过
            4 初审驳回
            5 终审驳回
            
     */
    private Integer status;

    @Column(name = "p_content")
    private String pContent;

    /**
     * 初审意见
     */
    private String fidea;

    /**
     * 最终审批意见
     */
    private String eidea;

    @Column(name = "start_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
    private Date startTime;

    @Column(name = "end_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
    private Date endTime;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
    private Date createTime;

    /**
     * 初次审批时间
     */
    @Column(name = "pd_check")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
    private Date pdCheck;

    /**
     * 最终审批时间
     */
    @Column(name = "pc_check")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
    private Date pcCheck;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取项目编号
     *
     * @return p_code - 项目编号
     */
    public String getpCode() {
        return pCode;
    }

    /**
     * 设置项目编号
     *
     * @param pCode 项目编号
     */
    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    /**
     * 获取员工id
     *
     * @return u_aid - 员工id
     */
    public Integer getuAid() {
        return uAid;
    }

    /**
     * 设置员工id
     *
     * @param uAid 员工id
     */
    public void setuAid(Integer uAid) {
        this.uAid = uAid;
    }

    /**
     * 获取部门id
     *
     * @return d_id - 部门id
     */
    public Integer getdId() {
        return dId;
    }

    /**
     * 设置部门id
     *
     * @param dId 部门id
     */
    public void setdId(Integer dId) {
        this.dId = dId;
    }

    /**
     * 获取项目名称
     *
     * @return p_name - 项目名称
     */
    public String getpName() {
        return pName;
    }

    /**
     * 设置项目名称
     *
     * @param pName 项目名称
     */
    public void setpName(String pName) {
        this.pName = pName;
    }

    /**
     * 获取0 已保存
            1 已提交
            2 初审通过
            3 终审通过
            4 初审驳回
            5 终审驳回
            
     *
     * @return status - 0 已保存
            1 已提交
            2 初审通过
            3 终审通过
            4 初审驳回
            5 终审驳回
            
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置0 已保存
            1 已提交
            2 初审通过
            3 终审通过
            4 初审驳回
            5 终审驳回
            
     *
     * @param status 0 已保存
            1 已提交
            2 初审通过
            3 终审通过
            4 初审驳回
            5 终审驳回
            
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取初审意见
     *
     * @return fidea - 初审意见
     */
    public String getFidea() {
        return fidea;
    }

    /**
     * 设置初审意见
     *
     * @param fidea 初审意见
     */
    public void setFidea(String fidea) {
        this.fidea = fidea;
    }

    /**
     * 获取最终审批意见
     *
     * @return eidea - 最终审批意见
     */
    public String getEidea() {
        return eidea;
    }

    /**
     * 设置最终审批意见
     *
     * @param eidea 最终审批意见
     */
    public void setEidea(String eidea) {
        this.eidea = eidea;
    }

    /**
     * @return start_time
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return end_time
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", pCode='" + pCode + '\'' +
                ", uAid=" + uAid +
                ", dId=" + dId +
                ", pName='" + pName + '\'' +
                ", status=" + status +
                ", fidea='" + fidea + '\'' +
                ", eidea='" + eidea + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", createTime=" + createTime +
                '}';
    }
}