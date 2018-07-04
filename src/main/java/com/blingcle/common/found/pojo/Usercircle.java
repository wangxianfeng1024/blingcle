package com.blingcle.common.found.pojo;

import java.util.Date;

public class Usercircle {
    private Long id;

    private Long userid;

    private Long circleid;

    private Date createtime;

    private String updateby;

    private Date updatetime;

    private String modificy;

    private Boolean isvalid;

    private Integer version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getCircleid() {
        return circleid;
    }

    public void setCircleid(Long circleid) {
        this.circleid = circleid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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
}