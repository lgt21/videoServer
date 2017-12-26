package com.lgt.springboot.test.videoServet.utils;

/**
 * @autor lgt
 * @date 2017/12/17 3:03
 */
public class StringUtils {

    public static Boolean isBlank(String s) {
        if(s == null || s.equals("")) {
            return true;
        }
        return false;
    }

}
