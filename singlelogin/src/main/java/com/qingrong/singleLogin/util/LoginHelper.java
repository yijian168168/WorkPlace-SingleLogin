package com.qingrong.singleLogin.util;

import java.util.UUID;

/**
 * @Author: ZhangQingrong
 * @Date : 2017/10/10 16:47
 */
public class LoginHelper {

    /**
     * 登陆 用户id
     * */
    public static final String LOGIN_USERID = "login_userid";
    /**
     * 登陆 用户盐值
     * */
    public static final String LOGIN_SALT = "login_salt";

    /**
     * 获取盐值
     * */
    public static String getSalt(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
