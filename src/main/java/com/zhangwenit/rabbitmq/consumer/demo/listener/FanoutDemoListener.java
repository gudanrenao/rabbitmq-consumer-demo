package com.zhangwenit.rabbitmq.consumer.demo.listener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author ZWen
 * @Date 2019/9/15 5:06 PM
 * @Version 1.0
 **/
@Component
@RabbitListener(queues = {"ZW_FANOUT_DEMO_QUEUE_01"}, containerFactory = "rabbitListenerContainerFactory")
public class FanoutDemoListener {

    @RabbitHandler
    public void receive(String msg) {
        System.out.println("queue[ZW_FANOUT_DEMO_QUEUE_01] receive msg is : " + msg);
    }
}