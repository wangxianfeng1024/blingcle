package com.blingcle.common.found.vo;

import com.blingcle.common.found.pojo.Videolabel;

import java.util.Date;
import java.util.List;

/**
 * Created by 王显锋 on 2018/7/4.
 */
public class VideoVo {
    private Long id;

    private Long userid;

    private String videoname;

    private String videotype;

    private String videourl;

    private Date createdate;

    private Boolean isvalid ;

    private String introduction;

    private Long musicid;

    private Integer permission;

    private Integer status;

    private String videopictureurl;

    private String videopicturename;

    private String updateby;

    private Date updatetime;

    private String modificy;

    private String musicurl;

    private Integer version ;

    private String address;

    private String city;

    private Long circleid;

    private List<Videolabel> videolabel;

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

    public String getMusicurl() {
        return musicurl;
    }

    public void setMusicurl(String musicurl) {
        this.musicurl = musicurl == null ? null : musicurl.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Long getCircleid() {
        return circleid;
    }

    public void setCircleid(Long circleid) {
        this.circleid = circleid;
    }

    public List<Videolabel> getVideolabel() {
        return videolabel;
    }

    public void setVideolabel(List<Videolabel> videolabel) {
        this.videolabel = videolabel;
    }
}
