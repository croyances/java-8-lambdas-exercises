package com.example.demo.redisdemo.redisdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@EnableScheduling
@Component
public class RedisTestCopy {

    @Autowired
    private  StringRedisTemplate redisTemplate ;

//    @Scheduled(fixedRate = 1000)
//    public void sendMessage() {
//        redisTemplate.convertAndSend("test", String.valueOf(Math.random()));
//    }
//
//    @Scheduled(fixedRate = 1000)
//    public void sendMessage22() {
//        redisTemplate.convertAndSend("test22", String.valueOf(Math.random()));
//    }
}
