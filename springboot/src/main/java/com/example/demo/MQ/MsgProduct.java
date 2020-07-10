package com.example.demo.MQ;




import org.apache.activemq.broker.region.Destination;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;


@Service
public class MsgProduct {


    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;



    public  void pushActiveMQTopic(ActiveMQTopic activeMQTopic , String msg){
        jmsMessagingTemplate.convertAndSend(activeMQTopic,msg);

    }

    public  void pushActiveMQQueue(ActiveMQQueue activeMQQueue , String msg){
        jmsMessagingTemplate.convertAndSend(activeMQQueue,msg);

    }
}
