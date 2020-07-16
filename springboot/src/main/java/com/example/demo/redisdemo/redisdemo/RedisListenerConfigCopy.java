package com.example.demo.redisdemo.redisdemo;


import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;

@Configuration

@AutoConfigureAfter({RedisReceiver.class})
public class RedisListenerConfigCopy {

    @Bean
    RedisMessageListenerContainer container2(RedisConnectionFactory connectionFactory,
                                            MessageListener listenerAdapter,MessageListener listenerAdapter2) {
        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);

        //可以添加多个 messageListener
        container.addMessageListener(listenerAdapter, new PatternTopic("test"));
        container.addMessageListener(listenerAdapter2, new PatternTopic("test22"));

        return container;
    }

    @Bean
    MessageListenerAdapter listenerAdapter(RedisReceiver redisReceiver) {
        System.out.println("消息适配器进来了");
        return new MessageListenerAdapter(redisReceiver, "receiveMessage");
    }


    @Bean
    MessageListenerAdapter listenerAdapter2(RedisReceiver redisReceiver) {
        System.out.println("消息适配器进来了");
        return new MessageListenerAdapter(redisReceiver, "receiveMessage2");
    }





}
