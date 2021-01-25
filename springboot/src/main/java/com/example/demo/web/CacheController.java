package com.example.demo.web;


import com.example.demo.cahce.MyCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 */
@RestController
@RequestMapping("/")
public class CacheController {

    @Autowired
    private MyCache myCache;

    @Autowired
    private ApplicationContext applicationContext ;


    @Autowired
    private StringRedisTemplate redisTemplate ;


    @GetMapping("/cache")
    public String test(){
        applicationContext.publishEvent("1");
        redisTemplate.convertAndSend("test", String.valueOf(Math.random()));
        return myCache.getMap().toString();
    }
}
