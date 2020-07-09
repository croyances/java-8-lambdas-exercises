package com.example.demo.listenerdemo;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


@Component
public class MyEventListen implements ApplicationListener<MyEvent> {


    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        User user = myEvent.getUser();
        System.out.println(user.getName());
    }
}
