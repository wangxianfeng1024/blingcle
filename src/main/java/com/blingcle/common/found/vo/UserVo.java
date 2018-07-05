package com.blingcle.common.found.vo;

import com.blingcle.common.found.pojo.Userdetail;
import com.github.pagehelper.PageInfo;

import java.util.Date;
import java.util.List;

/**
 * Created by 王显锋 on 2018/7/4.
 */
public class UserVo {
    private Long id;

    private String name;

    private String password;

    private String phone;

    private Date lastupdate;

    private Boolean isrealname;

    private Integer type;

    private Date createdate ;

    private String loginname;

    private Date fristlogintime ;

    private Date lastlogintime;

    private String lastloginfacility;

    private Boolean isprime ;

    private Integer version;

    private Integer status;

    private String updateby;

    private Date updatetime;

    private String modificy;

    private Boolean isvalid = true;

    private String invitecode;

    private String registerinvitecode;

    private String authkey;

    private String logintype;

    private Userdetail userdetail;//用户详情

    private List<UserVo> fans;   //粉丝

    private List<UserVo> attention;  //关注

    private PageInfo<VideoVo> production; //作品

    private PageInfo<VideoVo> praise;  //喜欢，点赞

    public String getLogintype() {
        return logintype;
    }

    public void setLogintype(String logintype) {
        this.logintype = logintype;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAuthkey() {
        return authkey;
    }

    public void setAuthkey(String authkey) {
        this.authkey = authkey;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public Boolean getIsrealname() {
        return isrealname;
    }

    public void setIsrealname(Boolean isrealname) {
        this.isrealname = isrealname;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public Date getFristlogintime() {
        return fristlogintime;
    }

    public void setFristlogintime(Date fristlogintime) {
        this.fristlogintime = fristlogintime;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public String getLastloginfacility() {
        return lastloginfacility;
    }

    public void setLastloginfacility(String lastloginfacility) {
        this.lastloginfacility = lastloginfacility;
    }

    public Boolean getIsprime() {
        return isprime;
    }

    public void setIsprime(Boolean isprime) {
        this.isprime = isprime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby;
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
        this.modificy = modificy;
    }

    public Boolean getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(Boolean isvalid) {
        this.isvalid = isvalid;
    }

    public String getInvitecode() {
        return invitecode;
    }

    public void setInvitecode(String invitecode) {
        this.invitecode = invitecode;
    }

    public String getRegisterinvitecode() {
        return registerinvitecode;
    }

    public void setRegisterinvitecode(String registerinvitecode) {
        this.registerinvitecode = registerinvitecode;
    }

    public Userdetail getUserdetail() {
        return userdetail;
    }

    public void setUserdetail(Userdetail userdetail) {
        this.userdetail = userdetail;
    }

    public List<UserVo> getFans() {
        return fans;
    }

    public void setFans(List<UserVo> fans) {
        this.fans = fans;
    }

    public List<UserVo> getAttention() {
        return attention;
    }

    public void setAttention(List<UserVo> attention) {
        this.attention = attention;
    }

    public PageInfo<VideoVo> getProduction() {
        return production;
    }

    public void setProduction(PageInfo<VideoVo> production) {
        this.production = production;
    }

    public PageInfo<VideoVo> getPraise() {
        return praise;
    }

    public void setPraise(PageInfo<VideoVo> praise) {
        this.praise = praise;
    }
}
