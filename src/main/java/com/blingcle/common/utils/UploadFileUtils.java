package com.blingcle.common.utils;

import org.springframework.stereotype.Component;

import java.io.File;
import java.net.URL;

/**
 * Created by 王显锋 on 2018/7/5.
 */
@Component
public class UploadFileUtils {
//    private static String templateURL = "";
//    File file = new File(templateURL);
//
//    public void execute(String... strings) {
//        if (file.isDirectory() && file.exists()) {
//        } else {
//            String os = System.getProperty("os.name");
//            File files = null;
//            if (os.toLowerCase().startsWith("win")) {
//                URL url = ClassLoader.getSystemResource("excelTemplate");
//                files = new File(url.getPath());
//            } else {
//                URL url = Thread.currentThread().getContextClassLoader().getResource("");
//                files = new File(url.getPath() + "/excelTemplate/");
//            }
//        }
//    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        String os = System.getProperty("os.name");
        File files = null;
        URL url = null;
        if (os.toLowerCase().startsWith("win")) {
             url = ClassLoader.getSystemResource("static");
            files = new File(url.getPath());
        } else {
             url = Thread.currentThread().getContextClassLoader().getResource("");
            files = new File(url.getPath() + "/static/");
        }
        System.out.println(files);
    }
}

