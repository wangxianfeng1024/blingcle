package com.blingcle.common.found.pojo;

import com.blingcle.common.core.utils.Page;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class Bvideotd {
    private Long id;

    private Long userid;

    private String videoname;

    private String videotype;

    private String videourl;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createdate=new Date();

    private Boolean isvalid=true;

    private String introduction;

    private Long musicid;

    private Integer permission;

    private Integer viewcount=0;

    private Integer sharecount=0;

    private Long circleid;

    private Integer status=00;

    private String videopictureurl;

    private String videopicturename;

    private Integer praisecount =0;

    private List<Bvideolabeltd> bvideolabeltds;

    private Page page;

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public Integer getPraisecount() {
        return praisecount;
    }

    public void setPraisecount(Integer praisecount) {
        this.praisecount = praisecount;
    }

    public List<Bvideolabeltd> getBvideolabeltds() {
        return bvideolabeltds;
    }

    public void setBvideolabeltds(List<Bvideolabeltd> bvideolabeltds) {
        this.bvideolabeltds = bvideolabeltds;
    }

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

    public String getVideoname() {
        return videoname;
    }

    public void setVideoname(String videoname) {
        this.videoname = videoname == null ? null : videoname.trim();
    }

    public String getVideotype() {
        return videotype;
    }

    public void setVideotype(String videotype) {
        this.videotype = videotype == null ? null : videotype.trim();
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl == null ? null : videourl.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Boolean getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(Boolean isvalid) {
        this.isvalid = isvalid;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public Long getMusicid() {
        return musicid;
    }

    public void setMusicid(Long musicid) {
        this.musicid = musicid;
    }

    public Integer getPermission() {
        return permission;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    public Integer getViewcount() {
        return viewcount;
    }

    public void setViewcount(Integer viewcount) {
        this.viewcount = viewcount;
    }

    public Integer getSharecount() {
        return sharecount;
    }

    public void setSharecount(Integer sharecount) {
        this.sharecount = sharecount;
    }

    public Long getCircleid() {
        return circleid;
    }

    public void setCircleid(Long circleid) {
        this.circleid = circleid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getVideopictureurl() {
        return videopictureurl;
    }

    public void setVideopictureurl(String videopictureurl) {
        this.videopictureurl = videopictureurl == null ? null : videopictureurl.trim();
    }

    public String getVideopicturename() {
        return videopicturename;
    }

    public void setVideopicturename(String videopicturename) {
        this.videopicturename = videopicturename == null ? null : videopicturename.trim();
    }
}