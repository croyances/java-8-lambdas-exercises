package com.example.demo.redisdemo;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;


/**
 * @author admin
 */
@Configuration
public class RedisListen implements MessageListener {



    // 接收订阅的消息
    @Override
    public void onMessage(Message message, byte[] bytes) {
        System.out.println("消息来了"+"121321321");
    }

}
