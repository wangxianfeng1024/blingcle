package com.blingcle.common.core.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 王显锋 on 18/6/14.
 */
public class PageResult<T> {
    private Long total;// 总条数
    private Integer pageSize;// 页面大小
    private Integer pageNo;// 当前页
    private Integer totalPageCount;// 共几页
    private List<T> items;// 集合数据

    public PageResult() {
    }

    public PageResult(Long total, Integer pageSize, Integer pageNo,
                      List<T> items) {
        this.total = total;
        this.pageSize = pageSize;
        this.pageNo = pageNo;
        this.items = items;
        this.totalPageCount = (int) (total % pageSize == 0 ? total / pageSize : total
                / pageSize + 1);
    }


    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
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

    public Integer getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(Integer totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public PageResult<T> paging() {
        List<T> pageItems = new ArrayList<T>();
        // size=5 no=1 : 0-4
        // size=5 no=2 : 5-9
        int no = this.getPageNo();
        int size = this.getPageSize();
        List<T> ls = this.getItems();
        for (int i = (no - 1) * size; i < no * size; i++) {
            if (i < ls.size()) {
                pageItems.add(ls.get(i));
            }
        }
        this.setItems(pageItems);
        return this;
    }


}
