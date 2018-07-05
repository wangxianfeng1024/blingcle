package com.blingcle.common.core.constant;

import java.util.Map;

/**
 * Created by 王显锋 on 2018/6/25.
 */
public class Constants {
    public final static String RETURN_STATUS_CODE_ERROR="404";
    public final static String RETURN_STATUS_CODE_SUCCESS="200";



    //验证码发送状态
    public final static String  MESSAGE_SEND_SUCCESS="0"; //提交成功
    public final static String  MESSAGE_SEND_ERROR="100";//提交失败


    //用户登录方式
    public final static String LOGIN_FOR_USERNAME="00";
    public final static String LOGIN_FOR_PHONE="01";



    //用户密码解密key
    public final static String PASSWORD_DECRYPT_KEY="123456";


    //地区省份父id
    public final static Integer REGION_PARENTID=0;

    //静态map，系统启动时注入系统参数
    public  static Map mapforSystem;





}
