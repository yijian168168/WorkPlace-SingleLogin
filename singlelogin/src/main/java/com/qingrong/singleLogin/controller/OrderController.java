package com.qingrong.singleLogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: ZhangQingrong
 * @Date : 2017/10/10 16:55
 */
@Controller
@RequestMapping("order")
public class OrderController {

    @RequestMapping("createOrder")
    public String createOrder(){
        return "success";
    }

}
