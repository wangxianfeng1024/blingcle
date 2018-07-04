package com.blingcle.common.found.pojo;

import java.util.Date;

public class Music {
    private Long musicid;

    private String musicname;

    private String musicurl;

    private Long createby;

    private String musicsource;

    private Date createtime;

    private Boolean isvalid;

    private Long musiclistencount;

    private String updateby;

    private Date updatetime;

    private String modificy;

    private Integer version;

    public Long getMusicid() {
        return musicid;
    }

    public void setMusicid(Long musicid) {
        this.musicid = musicid;
    }

    public String getMusicname() {
        return musicname;
    }

    public void setMusicname(String musicname) {
        this.musicname = musicname == null ? null : musicname.trim();
    }

    public String getMusicurl() {
        return musicurl;
    }

    public void setMusicurl(String musicurl) {
        this.musicurl = musicurl == null ? null : musicurl.trim();
    }

    public Long getCreateby() {
        return createby;
    }

    public void setCreateby(Long createby) {
        this.createby = createby;
    }

    public String getMusicsource() {
        return musicsource;
    }

    public void setMusicsource(String musicsource) {
        this.musicsource = musicsource == null ? null : musicsource.trim();
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

    public Long getMusiclistencount() {
        return musiclistencount;
    }

    public void setMusiclistencount(Long musiclistencount) {
        this.musiclistencount = musiclistencount;
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

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}