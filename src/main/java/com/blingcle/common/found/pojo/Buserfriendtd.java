package com.blingcle.common.found.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Buserfriendtd {
    private Long userid;

    private Long fansid;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createtime;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getFansid() {
        return fansid;
    }

    public void setFansid(Long fansid) {
        this.fansid = fansid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}