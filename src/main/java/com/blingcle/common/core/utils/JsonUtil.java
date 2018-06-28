package com.blingcle.common.core.utils;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by 王显锋 on 18/6/14.
 * 请求响应结果进行统一封装
 */


public class JsonUtil {
    private static final int SUCCESS = 200;
    private static final int FAILURE = 404;
    private static final String IS_SUCCESS = "isSuccess";
    private static final String ERROR_MESSAGE = "errorMessage";

    /**
     * 请求成功
     *
     * @param resultData
     * @return
     */
    public static Map success(Object resultData) {

        Map resultJSON = new HashMap();

        resultJSON.put("data", resultData);
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

        resultJSON.put("data", "");
        resultJSON.put(IS_SUCCESS, SUCCESS);

        return resultJSON;
    }

    /**
     * 请求失败
     *
     * @param errorMessage
     * @return
     */
    public static Map failure(String errorMessage) {

        Map resultJSON = new HashMap();

        resultJSON.put(IS_SUCCESS, FAILURE);
        resultJSON.put(ERROR_MESSAGE, errorMessage);

        return resultJSON;

    }

    public static Map failure(String errorCode, String errorMessage) {

        Map resultJSON = new HashMap();

        resultJSON.put(IS_SUCCESS, errorCode);
        resultJSON.put(ERROR_MESSAGE, errorMessage);

        return resultJSON;

    }
}
