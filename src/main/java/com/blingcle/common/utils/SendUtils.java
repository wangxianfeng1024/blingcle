package com.blingcle.common.utils;

import com.blingcle.common.core.constant.Constants;
import com.blingcle.common.core.exception.BusinessException;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.message.BasicNameValuePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ObjectUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Created by 王显锋 on 2018/7/6.
 */
@SuppressWarnings("all")
public class SendUtils {
    private static Logger logger = LoggerFactory.getLogger(SendUtils.class);

    public static String sendMessage(String phone, String content) {
        Map map = Constants.mapforSystem;
        if (ObjectUtils.isEmpty(map)) {
            logger.info("mapforSystem为空，请检查系统参数配置！");
            throw new BusinessException("验证码发送失败！");
        }
        String Account = null == map.get("ACCOUNT") ? "" : map.get("ACCOUNT").toString();
        String Pwd = null == map.get("PWD") ? "" : map.get("PWD").toString();
        String SignId = null == map.get("SIGNID") ? "" : map.get("SIGNID").toString();
        String TemplateId = null == map.get("TEMPLATEID") ? "" : map.get("TEMPLATEID").toString();
        try {
            List<NameValuePair> formparams = new ArrayList<NameValuePair>();
            formparams.add(new BasicNameValuePair("Account", Account));
            formparams.add(new BasicNameValuePair("Pwd", Pwd));
            formparams.add(new BasicNameValuePair("Content", content));
            formparams.add(new BasicNameValuePair("SignId", SignId));
            formparams.add(new BasicNameValuePair("Mobile", phone));
            formparams.add(new BasicNameValuePair("TemplateId", TemplateId));
            Post(formparams);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "01";
        }
        return "00";
    }

    public static void Post(List<NameValuePair> formparams) throws Exception {
        CloseableHttpAsyncClient httpClient = HttpAsyncClients.createDefault();
        httpClient.start();
        String requestUrl = null == Constants.mapforSystem.get("REQUESTURL") ? "" : Constants.mapforSystem.get("REQUESTURL").toString();
        HttpPost requestPost = new HttpPost(requestUrl);
        requestPost.setEntity(new UrlEncodedFormEntity(formparams, "utf-8"));
        httpClient.execute(requestPost, new FutureCallback<HttpResponse>() {
            public void failed(Exception arg0) {
                System.out.println("Exception: " + arg0.getMessage());
            }
            public void completed(HttpResponse arg0) {
                System.out.println("Response: " + arg0.getStatusLine());
                try {
                    InputStream stram = arg0.getEntity().getContent();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(stram));
                } catch (UnsupportedOperationException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            public void cancelled() {
            }
        }).get();
    }

    public static String getFourRandom() {
        Random random = new Random();
        String fourRandom = random.nextInt(1000000) + "";
        int randLength = fourRandom.length();
        if (randLength < 6) {
            for (int i = 1; i <= 6 - randLength; i++)
                fourRandom = "0" + fourRandom;
        }
        return fourRandom;
    }
}
