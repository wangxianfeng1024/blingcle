package com.blingcle.common.found.pojo;

import java.util.Date;

public class Share {
    private Long id;

    private Long userid;

    private Long videoid;

    private Date sharetime;

    private Integer sharetype;

    private String updateby;

    private Date updatetime;

    private String modicify;

    private Integer version;

    private Boolean isvalid;

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

    public Long getVideoid() {
        return videoid;
    }

    public void setVideoid(Long videoid) {
        this.videoid = videoid;
    }

    public Date getSharetime() {
        return sharetime;
    }

    public void setSharetime(Date sharetime) {
        this.sharetime = sharetime;
    }

    public Integer getSharetype() {
        return sharetype;
    }

    public void setSharetype(Integer sharetype) {
        this.sharetype = sharetype;
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

    public String getModicify() {
        return modicify;
    }

    public void setModicify(String modicify) {
        this.modicify = modicify == null ? null : modicify.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Boolean getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(Boolean isvalid) {
        this.isvalid = isvalid;
    }
}