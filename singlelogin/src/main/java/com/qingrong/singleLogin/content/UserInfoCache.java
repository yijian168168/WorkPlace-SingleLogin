package com.qingrong.singleLogin.content;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ZhangQingrong
 * @Date : 2017/10/10 16:59
 */
public class UserInfoCache {

    private static final Map<String, String> userInfo = new HashMap<String, String>();

    public static void addUserInfo(String key, String value) {
        userInfo.put(key,value);
    }

    public static String getUserInfo(String key) {
        return userInfo.get(key);
    }
}
