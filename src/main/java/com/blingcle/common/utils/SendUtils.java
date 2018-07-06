package com.blingcle.common.utils;

import com.blingcle.common.core.constant.Constants;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.message.BasicNameValuePair;

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

    public static String sendMessage(String phone, String content) {
     Map map= Constants.mapforSystem;
        try {
            List<NameValuePair> formparams = new ArrayList<NameValuePair>();
            formparams.add(new BasicNameValuePair("Account", map.get("ACCOUNT").toString()));
            formparams.add(new BasicNameValuePair("Pwd", map.get("PWD").toString()));
            formparams.add(new BasicNameValuePair("Content",content));
            formparams.add(new BasicNameValuePair("SignId", map.get("SIGNID").toString()));
            formparams.add(new BasicNameValuePair("Mobile", phone));
            formparams.add(new BasicNameValuePair("TemplateId", map.get("TEMPLATEID").toString()));
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
        HttpPost requestPost = new HttpPost(Constants.mapforSystem.get("REQUESTURL").toString());
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
