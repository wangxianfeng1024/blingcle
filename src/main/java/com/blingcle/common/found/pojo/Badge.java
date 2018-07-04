package com.blingcle.common.found.pojo;

import java.util.Date;

public class Badge {
    private Long id;

    private String badgename;

    private String pathway;

    private Integer type;

    private String function;

    private String illustrate;

    private Date createtime;

    private Boolean isvalid;

    private String createby;

    private Integer version;

    private String updateby;

    private Date updatetime;

    private String modificy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBadgename() {
        return badgename;
    }

    public void setBadgename(String badgename) {
        this.badgename = badgename == null ? null : badgename.trim();
    }

    public String getPathway() {
        return pathway;
    }

    public void setPathway(String pathway) {
        this.pathway = pathway == null ? null : pathway.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function == null ? null : function.trim();
    }

    public String getIllustrate() {
        return illustrate;
    }

    public void setIllustrate(String illustrate) {
        this.illustrate = illustrate == null ? null : illustrate.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Boolean getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(Boolean isvalid) {
        this.isvalid = isvalid;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
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
}