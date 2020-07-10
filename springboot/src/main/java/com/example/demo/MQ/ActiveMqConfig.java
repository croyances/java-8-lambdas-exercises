package com.example.demo.MQ;


import org.apache.activemq.broker.region.Destination;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

import javax.jms.ConnectionFactory;


@Configuration

public class ActiveMqConfig {




    public static final String TOPIC_NAME = "activemq.topic";



    public static final String QUEUE_NAME = "activemq.queue";
    @Bean
    public ActiveMQTopic topic() {
        return new ActiveMQTopic(TOPIC_NAME);
    }
    @Bean
    public ActiveMQQueue queue() {
        return  new ActiveMQQueue(QUEUE_NAME);
    }
    
    @Bean
    public JmsListenerContainerFactory topicListener(ConnectionFactory connectionFactory) {
        DefaultJmsListenerContainerFactory factory = new
                DefaultJmsListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);

        factory.setPubSubDomain(true);
        return factory;
    }

}
