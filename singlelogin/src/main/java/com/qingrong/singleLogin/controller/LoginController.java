package com.qingrong.singleLogin.controller;

import com.qingrong.singleLogin.content.Content;
import com.qingrong.singleLogin.util.CookieHelper;
import com.qingrong.singleLogin.util.LoginHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登陆
 *
 * @Author: ZhangQingrong
 * @Date : 2017/10/10 16:33
 */
@Controller
@RequestMapping("login")
public class LoginController {

    @RequestMapping("validate")
    public String login(HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        String value = "";
        String userName = servletRequest.getParameter("userName");
        if (null != userName && "qingrong".equals(userName)) {
            //登陆成功,添加cookie
            CookieHelper.setCookie(servletResponse, LoginHelper.LOGIN_USERID, "qingrong", 0);
            CookieHelper.setCookie(servletResponse, LoginHelper.LOGIN_SALT, LoginHelper.getSalt(), 0);
            value = "success";
        } else {
            //登陆失败，清除cookie
            CookieHelper.delCookie(servletRequest, servletResponse, LoginHelper.LOGIN_USERID);
            CookieHelper.delCookie(servletRequest, servletResponse, LoginHelper.LOGIN_SALT);
            value = "fail";
        }
        return value;
    }
}
