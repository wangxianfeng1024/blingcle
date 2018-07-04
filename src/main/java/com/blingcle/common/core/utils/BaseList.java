package com.blingcle.common.core.utils;


/**
 * Created by 王显锋 on 18/6/14.
 */
public class BaseList<T> {

    //请求数据list
    private  Long id;
    private String systeminfo;
    private T     formbean;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public T getFormbean() {
        return formbean;
    }

    public void setFormbean(T formbean) {
        this.formbean = formbean;
    }



    public String getSysteminfo() {
        return systeminfo;
    }

    public void setSysteminfo(String systeminfo) {
        this.systeminfo = systeminfo;
    }

//
}
