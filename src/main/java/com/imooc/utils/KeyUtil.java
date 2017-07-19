package com.imooc.utils;

import java.util.Random;

/**
 * Created by JanZhou1 on 2017/7/19.
 */
public class KeyUtil {
    /**
     * 生成主键
     * @return
     */
    public static synchronized String genUniqueKey() {

        Random random = new Random();

        Integer num = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(num);
    }
}
