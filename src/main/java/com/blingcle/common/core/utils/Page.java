package com.blingcle.common.core.utils;

/**
 * Created by 王显锋 on 18/6/14.
 */

import java.io.Serializable;

/**
 * 分页
 */
public class Page implements Serializable {
    private Integer pageNo=1;
    private Integer pageSize=20;

    public Page() {
    }

    public Page(Integer pageNo, Integer pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public int startIndex() {
        return (pageNo - 1) * pageSize;
    }

    public int endIndex() {
        return pageNo * pageSize;
    }

}