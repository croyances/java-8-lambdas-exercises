package com.example.demo.redisdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Component;


@Component
public class InitRedisListen implements MessageListener {


    @Autowired
    private ApplicationContext applicationContext ;

    @Override
    public void onMessage(Message message, byte[] bytes) {
        applicationContext.publishEvent("SS");
    }
}
