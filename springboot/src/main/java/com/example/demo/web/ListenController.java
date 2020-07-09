package com.example.demo.web;


import com.example.demo.handlerInterceptordemo.UnHandler;
import com.example.demo.listenerdemo.MyHttpSessionListen;
import com.example.demo.listenerdemo.User;
import com.example.demo.listenerdemo.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@RestController
@RequestMapping("/listenner")
public class ListenController {


    @Resource
    private ApplicationContext applicationContext;

    @UnHandler
    @GetMapping("/user")
    public User getUser(HttpServletRequest request) {
        ServletContext application = request.getServletContext();
        return (User) application.getAttribute("user");
    }

    @GetMapping("/count")
    public String count(HttpSession  session ) {
       //
//        ServletContext application = request.getServletContext();
//
//        int count = (int)application.getAttribute("count");
        return "人数"+MyHttpSessionListen.count;
    }

    @GetMapping("/user2")
    public User getUser2(HttpServletRequest request) {

        UserService user = new UserService();

        return user.getUser2(applicationContext);

    }



}
