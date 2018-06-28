package com.blingcle.common.found.pojo;

import com.blingcle.common.found.vo.BusertcVo;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.pagehelper.PageInfo;

import java.util.Date;
import java.util.List;

public class Busertc {
    private Long id;

    private String name;

    private String password;

    private String phone;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastupdate;

    private Boolean isrealname;

    private Integer status;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createdate;

    private String loginname;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date fristlogintime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastlogintime;

    private String lastloginfacility;

    private Boolean isprime;

    private String authkey;

    private Buserdetailtc buserdetailtc;//用户详情

    private List<Busertc> fans;   //粉丝

    private List<Busertc> attention;  //关注

    private PageInfo<Bvideotd> production; //作品

    private PageInfo<Bvideotd> praise;  //喜欢，点赞

    public Buserdetailtc getBuserdetailtc() {
        return buserdetailtc;
    }

    public void setBuserdetailtc(Buserdetailtc buserdetailtc) {
        this.buserdetailtc = buserdetailtc;
    }

    public List<Busertc> getFans() {
        return fans;
    }

    public void setFans(List<Busertc> fans) {
        this.fans = fans;
    }

    public List<Busertc> getAttention() {
        return attention;
    }

    public void setAttention(List<Busertc> attention) {
        this.attention = attention;
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

    public PageInfo<Bvideotd> getProduction() {
        return production;
    }

    public void setProduction(PageInfo<Bvideotd> production) {
        this.production = production;
    }

    public PageInfo<Bvideotd> getPraise() {
        return praise;
    }

    public void setPraise(PageInfo<Bvideotd> praise) {
        this.praise = praise;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
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


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        this.loginname = loginname == null ? null : loginname.trim();
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
        this.lastloginfacility = lastloginfacility == null ? null : lastloginfacility.trim();
    }

    public Boolean getIsprime() {
        return isprime;
    }

    public void setIsprime(Boolean isprime) {
        this.isprime = isprime;
    }
}