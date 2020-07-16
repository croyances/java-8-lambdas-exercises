package com.example.demo.listenerdemo.ContextRefreshedEventDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;


@Component
public class ContextEvent implements ApplicationListener<ContextRefreshedEvent> {


    @Autowired
    private StringRedisTemplate redisTemplate ;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        redisTemplate.convertAndSend("loadCache","loadCache");

    }
}
