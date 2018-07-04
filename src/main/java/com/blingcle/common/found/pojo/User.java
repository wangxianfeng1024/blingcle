package com.blingcle.common.found.pojo;

import java.util.Date;

public class User {
    private Long id;

    private String name;

    private String password;

    private String phone;

    private Date lastupdate;

    private Boolean isrealname;

    private Integer type;

    private Date createdate;

    private String loginname;

    private Date fristlogintime;

    private Date lastlogintime;

    private String lastloginfacility;

    private Boolean isprime;

    private Integer version;

    private Integer status;

    private String updateby;

    private Date updatetime;

    private String modificy;

    private Boolean isvalid;

    private String invitecode;

    private String registerinvitecode;

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

    public String getInvitecode() {
        return invitecode;
    }

    public void setInvitecode(String invitecode) {
        this.invitecode = invitecode == null ? null : invitecode.trim();
    }

    public String getRegisterinvitecode() {
        return registerinvitecode;
    }

    public void setRegisterinvitecode(String registerinvitecode) {
        this.registerinvitecode = registerinvitecode == null ? null : registerinvitecode.trim();
    }
}