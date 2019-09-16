package com.zhangwenit.rabbitmq.consumer.demo.listener;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
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
@RabbitListener(queues = {"ZW_DIRECT_DEMO_QUEUE_02"}, containerFactory = "rabbitListenerContainerFactory")
public class DirectDemo2Listener {

    @RabbitHandler
    public void receive(String msg, Channel channel, Message message) {
        System.out.println("queue[ZW_DIRECT_DEMO_QUEUE_02] receive msg is : " + msg);
        //手动应答
//        channel.basicAck(message.getMessageProperties().getDeliveryTag(),false);
    }
}