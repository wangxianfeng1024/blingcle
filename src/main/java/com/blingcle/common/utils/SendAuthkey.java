package com.blingcle.common.utils;

import java.util.Random;

/**
 * Created by 王显锋 on 2018/6/22.
 */
@SuppressWarnings("all")
public class SendAuthkey {

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


    public static void main(String[] args) {
        String s = getFourRandom();
        System.out.println(s);
    }
}
