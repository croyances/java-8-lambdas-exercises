package com.example.demo.listenerdemo;


import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    public User getUser() {
        return new User("蔡", "武汉");
    }


    public User getUser2(ApplicationContext applicationContext) {

        User user = new User("蔡", "武汉啊");

        MyEvent event = new MyEvent(this, user);
        applicationContext.publishEvent(event);
        return user;

    }


}
