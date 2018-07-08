package com.blingcle.common.core.utils;


import com.blingcle.common.core.constant.Constants;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 王显锋 on 18/6/14.
 * 请求响应结果进行统一封装
 */


public class JsonUtil {
    private static final String SUCCESS = Constants.RETURN_STATUS_CODE_SUCCESS;
    private static final String FAILURE = Constants.RETURN_STATUS_CODE_ERROR;
    private static final String IS_SUCCESS = "status";
    private static final String ERROR_MESSAGE = "msg";

    /**
     * 请求成功
     *
     * @param data
     * @return
     */
    public static Map success(Object data) {

        Map resultJSON = new HashMap();

        resultJSON.put("data", data);
        resultJSON.put(IS_SUCCESS, SUCCESS);

//        return resultJSON.toJSONString();
        return resultJSON;
    }

    /**
     * 请求成功  无返回数据
     *
     * @return
     */
    public static Map success() {

        Map resultJSON = new HashMap();

//        resultJSON.put("data", "");
        resultJSON.put(IS_SUCCESS, SUCCESS);

        return resultJSON;
    }

    /**
     * 请求失败
     *
     * @param msg
     * @return
     */
    public static Map failure(String msg) {

        Map resultJSON = new HashMap();

        resultJSON.put(IS_SUCCESS, FAILURE);
        resultJSON.put(ERROR_MESSAGE, msg);

        return resultJSON;

    }

//    public static Map failure(String errorCode, String msg) {
//
//        Map resultJSON = new HashMap();
//
//        resultJSON.put(IS_SUCCESS, errorCode);
//        resultJSON.put(ERROR_MESSAGE, msg);
//
//        return resultJSON;
//
//    }
}
