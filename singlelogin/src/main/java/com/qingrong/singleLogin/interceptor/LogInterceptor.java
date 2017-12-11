package com.qingrong.singleLogin.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

/**
 * 日志拦截器
 * @Author: ZhangQingrong
 * @Date : 2017/10/10 16:12
 */
@Component
public class LogInterceptor implements WebRequestInterceptor {

    public void preHandle(WebRequest webRequest) throws Exception {

    }

    public void postHandle(WebRequest webRequest, ModelMap modelMap) throws Exception {

    }

    public void afterCompletion(WebRequest webRequest, Exception e) throws Exception {

    }
}
