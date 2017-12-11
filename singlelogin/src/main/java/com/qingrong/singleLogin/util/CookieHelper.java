package com.qingrong.singleLogin.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class CookieHelper {

    /**
     * cookie 内容保存时间 1 小时
     * */
    private static final Integer COOKIE_MAX_AGE = 1000 * 60 * 60;
    /**
     * cookie 内容编码格式
     * */
    private static final String ENCODING = "UTF-8";
    /**
     * cookie 域名
     * */
    private static final String DOMAIN = ".csair.com";
    /**
     * cookie 保存路径
     * */
    private static final String PATH = "/";

    public static void setCookie(HttpServletResponse response, String key, String value, int maxAge) {
        try {
            Cookie cookie = new Cookie(key, URLEncoder.encode(value, ENCODING));
            if (maxAge != 0) {
                cookie.setMaxAge(maxAge);
            } else {
                cookie.setMaxAge(COOKIE_MAX_AGE);
            }
            cookie.setPath(PATH);
            cookie.setDomain(DOMAIN);
            response.addCookie(cookie);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static Cookie getCookie(HttpServletRequest request, String key) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (key.equals(c.getName()))
                    return c;
            }
        }
        return null;
    }

    public static void delCookie(HttpServletRequest request, HttpServletResponse response, String name) {
        Cookie cookie = getCookie(request, name);
        if (cookie != null) {
            cookie.setValue("");
            cookie.setMaxAge(0);
            cookie.setPath("/");
            response.addCookie(cookie);
        }
    }
}
