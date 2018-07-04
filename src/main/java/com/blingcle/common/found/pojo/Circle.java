package com.blingcle.common.found.pojo;

import java.util.Date;

public class Circle {
    private Long id;

    private String circlename;

    private String circletype;

    private String labels;

    private Long grade;

    private Date createtime;

    private Long creater;

    private Integer status;

    private Integer introduction;

    private String updateby;

    private Date updatetime;

    private String modificy;

    private Boolean isvalid;

    private Integer version;

    private String badge;

    private String permission;

    private Integer integral;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCirclename() {
        return circlename;
    }

    public void setCirclename(String circlename) {
        this.circlename = circlename == null ? null : circlename.trim();
    }

    public String getCircletype() {
        return circletype;
    }

    public void setCircletype(String circletype) {
        this.circletype = circletype == null ? null : circletype.trim();
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels == null ? null : labels.trim();
    }

    public Long getGrade() {
        return grade;
    }

    public void setGrade(Long grade) {
        this.grade = grade;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Long getCreater() {
        return creater;
    }

    public void setCreater(Long creater) {
        this.creater = creater;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIntroduction() {
        return introduction;
    }

    public void setIntroduction(Integer introduction) {
        this.introduction = introduction;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getModificy() {
        return modificy;
    }

    public void setModificy(String modificy) {
        this.modificy = modificy == null ? null : modificy.trim();
    }

    public Boolean getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(Boolean isvalid) {
        this.isvalid = isvalid;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getBadge() {
        return badge;
    }

    public void setBadge(String badge) {
        this.badge = badge == null ? null : badge.trim();
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }
}