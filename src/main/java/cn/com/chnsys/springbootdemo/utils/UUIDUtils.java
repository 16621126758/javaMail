package cn.com.chnsys.springbootdemo.utils;

import java.util.UUID;

/**
 * @Class: UUIDUtils
 * @description:
 * @Author: hongzhi.zhao
 * @Date: 2019-05-24 17:08
 */
public class UUIDUtils {

    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
