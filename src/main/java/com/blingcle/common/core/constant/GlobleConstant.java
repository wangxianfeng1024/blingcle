package com.blingcle.common.core.constant;

/**
 * Created by 王显锋 on 18/6/14.
 * 此类用来定义全局的常量
 */

public class GlobleConstant {

    // 缓存名
    public static final String B_EHCACHE_NAME = "amsEhcache";

    public static final String B_SESSION_CODE = "userSessionInfo";

    // 缓存key前缀
    public static final String B_EHCACHE_KEY = "'p_'" + "'#root.method.name + #root.args'";

    // AMS_USER_LOG表optype列常量定义
    public enum AMS_USER_LOG_OPTYPE {
        USER_LOG_LOGIN_TYPE("A0"), // 用户登录
        USER_LOG_LOGOUT_TYPE("A1");  // 用户退出

        private String value;

        AMS_USER_LOG_OPTYPE(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}
