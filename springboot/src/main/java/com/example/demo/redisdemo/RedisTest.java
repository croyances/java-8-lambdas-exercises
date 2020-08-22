package com.example.demo.redisdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;


@EnableScheduling
@Component
public class RedisTest {

    @Autowired
    private  StringRedisTemplate redisTemplate ;

//    @Scheduled(fixedRate = 1000)
//    public void sendMessage() {
//        redisTemplate.convertAndSend("test", String.valueOf(Math.random()));
//    }

    @org.springframework.context.event.EventListener
    public void processEvent(Object event) {

    }
}
