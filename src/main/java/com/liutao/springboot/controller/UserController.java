package com.liutao.springboot.controller;

import com.liutao.springboot.bean.User;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/login")
    @ResponseBody
    public Object loginAction(HttpServletRequest request) {
        User user = new User();
        user.setId(1001);
        user.setUsername("zhangsan");
        request.getSession().setAttribute("user", user);
        return "login SUCCESS";
    }

    @RequestMapping("/center")
    @ResponseBody
    public Object center() {
        return "see center";
    }

    @RequestMapping("/out")
    @ResponseBody
    public Object out() {
        return "see out anytime";
    }

    @RequestMapping("/error")
    @ResponseBody
    public Object error() {
        return "error";
    }
}
