package com.example.demo.redisdemo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;

@Configuration
public class RedisListenerConfig {

    @Bean
    RedisMessageListenerContainer container(RedisConnectionFactory connectionFactory,
                                            RedisListen messageListener, InitRedisListen messageListener2) {
        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);

        //可以添加多个 messageListener
        //    container.addMessageListener(messageListener, new PatternTopic("test"));
        container.addMessageListener(messageListener2, new PatternTopic("loadCache"));

        return container;
    }

//    @Bean
//    MessageListenerAdapter listenerAdapter(RedisReceiver redisReceiver) {
//        System.out.println("消息适配器进来了");
//        return new MessageListenerAdapter(redisReceiver, "receiveMessage");
//    }
//
    //使用默认的工厂初始化redis操作模板
//    @Bean
//    StringRedisTemplate template(RedisConnectionFactory connectionFactory) {
//        return new StringRedisTemplate(connectionFactory);
//    }
}
