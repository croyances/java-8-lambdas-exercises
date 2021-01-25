package com.example.demo.MQ;


import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class QueueConsumer {


    @JmsListener(destination = ActiveMqConfig.QUEUE_NAME)
    public void receiveQueueMsg(String msg) {
        System.out.println("收到的消息为：" + msg);
    }


    @JmsListener(destination = ActiveMqConfig.TOPIC_NAME,
            containerFactory = "topicListener")
    public void receiveTopicMsg(String msg) {
        System.out.println("收到的消息为：" + msg);
    }

    @JmsListener(destination = ActiveMqConfig.TOPIC_NAME,
            containerFactory = "topicListener")
    public void receiveTopicMsg2(String msg) {
        System.out.println("收到的消息为：" + msg);
    }


}
