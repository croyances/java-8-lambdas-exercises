package com.example.demo.redisdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
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
}
