package com.blingcle.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by 王显锋 on 18/6/14.
 */
@Component
@ConfigurationProperties(prefix = "spring")
public class GlobleConfig {

    private String pageSize;

    private String batchSize;

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(String batchSize) {
        this.batchSize = batchSize;
    }
}
