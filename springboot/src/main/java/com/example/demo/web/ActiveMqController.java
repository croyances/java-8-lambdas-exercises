package com.example.demo.web;

import com.example.demo.MQ.MsgProduct;
import com.example.demo.handlerInterceptordemo.UnHandler;
import org.apache.activemq.broker.region.Destination;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/activemq")
public class ActiveMqController {
    private static final Logger logger =
            LoggerFactory.getLogger(ActiveMqController.class);
    @Resource
    private MsgProduct producer;
    @Resource
    private ActiveMQQueue queue;

    @Resource
    private ActiveMQTopic topic;

    @GetMapping("/send/queue")
    public String sendQueueMessage() {
        logger.info(" 开始发送点对点消息 ");
        producer.pushActiveMQQueue(queue, "Queue: hello activemq!");
        return "success";
    }

    @UnHandler
    @GetMapping("/send/topic")
    public String sendTopicMessage() {

        logger.info("===开始发送订阅消息===");
//        Destination destination = new ActiveMQTopic(ActiveMqConfig.TOPIC_NAME);
        producer.pushActiveMQTopic(topic, "Topic: hello activemq!");
        return "success";
    }
}
