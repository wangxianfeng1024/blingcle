package com.blingcle.common.found.vo;

import java.util.Date;

/**
 * Created by 王显锋 on 2018/6/26.
 */
public class BusertcVo {
    private Date lastupdate;
    private Integer status=00;
    private Long id;
    private String name;
    private String logintype;  //登录方式 00手机号登录  01 账号登录
    private String phone;      //手机号
    private String loginname;  //登录名
    private String password;   // 登录密码
    private String authkey;    //登录验证码
    private Date createdate = new Date();
    private Date fristlogintime = new Date();
    private String lastloginfacility;
    private Boolean isprime = false;
    private Date lastlogintime;
    private Boolean isrealname = false;

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getFristlogintime() {
        return fristlogintime;
    }

    public void setFristlogintime(Date fristlogintime) {
        this.fristlogintime = fristlogintime;
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

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public Boolean getIsrealname() {
        return isrealname;
    }

    public void setIsrealname(Boolean isrealname) {
        this.isrealname = isrealname;
    }

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

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthkey() {
        return authkey;
    }

    public void setAuthkey(String authkey) {
        this.authkey = authkey;
    }
}
