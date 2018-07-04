package com.blingcle.common.found.pojo;

import java.util.Date;

public class Label {
    private Long labelid;

    private Integer type;

    private String labelname;

    private Long count;

    private Date crtatetime;

    private Boolean isvalid;

    private String updateby;

    private Date updatetime;

    private String modificy;

    private Integer version;

    private String createby;

    public Long getLabelid() {
        return labelid;
    }

    public void setLabelid(Long labelid) {
        this.labelid = labelid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getLabelname() {
        return labelname;
    }

    public void setLabelname(String labelname) {
        this.labelname = labelname == null ? null : labelname.trim();
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Date getCrtatetime() {
        return crtatetime;
    }

    public void setCrtatetime(Date crtatetime) {
        this.crtatetime = crtatetime;
    }

    public Boolean getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(Boolean isvalid) {
        this.isvalid = isvalid;
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

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }
}