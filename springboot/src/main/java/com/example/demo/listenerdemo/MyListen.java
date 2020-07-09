package com.example.demo.listenerdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;


/**
 * @author admin
 */
@Component
public class MyListen implements ApplicationListener<ContextRefreshedEvent> {


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        ApplicationContext applicationContext = contextRefreshedEvent.getApplicationContext();
        UserService u = applicationContext.getBean(UserService.class);
        User user = u.getUser();
        ServletContext servletContext = applicationContext.getBean(ServletContext.class);
        servletContext.setAttribute("user",user);
    }
}
