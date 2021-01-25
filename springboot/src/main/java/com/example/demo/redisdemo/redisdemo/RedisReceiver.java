package com.example.demo.redisdemo.redisdemo;


import org.springframework.stereotype.Component;

@Component
public class RedisReceiver {


    public void receiveMessage(String message) {
        System.out.println("111");
    }

    public void receiveMessage2(String message) {
        System.out.println("222");
    }
}
