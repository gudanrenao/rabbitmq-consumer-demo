package com.zhangwenit.rabbitmq.consumer.demo.listener;

import com.zhangwenit.rabbitmq.dto.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author ZWen
 * @Date 2019/9/15 5:06 PM
 * @Version 1.0
 **/
@Component
@RabbitListener(queues = {"ZW_TOPIC_DEMO_QUEUE_01"}, containerFactory = "rabbitListenerContainerFactory")
public class TopicDemoListener {

    @RabbitHandler
    public void receive(@Payload User user) {
        System.out.println("queue[ZW_TOPIC_DEMO_QUEUE_01] receive msg is : " + user);
    }
}