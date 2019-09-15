package com.zhangwenit.rabbitmq.consumer.demo.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @Author ZWen
 * @Date 2019/9/15 4:06 PM
 * @Version 1.0
 **/
@Configuration
public class RabbitDeclareConfig {

    /**
     * 声明一个Topic类型的交换器
     *
     * @return
     */
    @Bean
    public TopicExchange demoTopicExchange() {
        return new TopicExchange("ZW_TOPIC_DEMO_EXCHANGE", false, false, null);
    }

    /**
     * 声明一个Direct类型的交换器
     *
     * @return
     */
    @Bean
    public DirectExchange demoDirectExchange() {
        return new DirectExchange("ZW_DIRECT_DEMO_EXCHANGE", false, false, null);
    }

    /**
     * 声明一个Fanout类型的交换器
     *
     * @return
     */
    @Bean
    public FanoutExchange demoFanoutExchange() {
        return new FanoutExchange("ZW_FANOUT_DEMO_EXCHANGE", false, false, null);
    }

    /**
     * 声明一个队列（和topic类型交换器绑定）
     *
     * @return
     */
    @Bean
    public Queue demoTopicQueue01() {
        return new Queue("ZW_TOPIC_DEMO_QUEUE_01", true, false, false, null);
    }

    @Bean
    public Binding topic01() {
        return new Binding("ZW_TOPIC_DEMO_QUEUE_01", Binding.DestinationType.QUEUE, "ZW_TOPIC_DEMO_EXCHANGE", "TOPIC.*.01", null);
    }

    /**
     * 声明一个队列（和topic类型交换器绑定）
     *
     * @return
     */
    @Bean
    public Queue demoTopicQueue02() {
        return new Queue("ZW_TOPIC_DEMO_QUEUE_02", true, false, false, null);
    }

    @Bean
    public Binding topic02() {
        return new Binding("ZW_TOPIC_DEMO_QUEUE_02", Binding.DestinationType.QUEUE, "ZW_TOPIC_DEMO_EXCHANGE", "TOPIC.*.02", null);
    }

    /**
     * 声明一个队列（和Direct类型交换器绑定）
     *
     * @return
     */
    @Bean
    public Queue demoDirectQueue01() {
        return new Queue("ZW_DIRECT_DEMO_QUEUE_01", true, false, false, null);
    }

    @Bean
    public Binding direct01() {
        return new Binding("ZW_DIRECT_DEMO_QUEUE_01", Binding.DestinationType.QUEUE, "ZW_DIRECT_DEMO_EXCHANGE", "DIRECT.01", null);
    }

    /**
     * 声明一个队列（和Direct类型交换器绑定）
     *
     * @return
     */
    @Bean
    public Queue demoDirectQueue02() {
        return new Queue("ZW_DIRECT_DEMO_QUEUE_02", true, false, false, null);
    }

    @Bean
    public Binding direct02() {
        return new Binding("ZW_DIRECT_DEMO_QUEUE_02", Binding.DestinationType.QUEUE, "ZW_DIRECT_DEMO_EXCHANGE", "DIRECT.02", null);
    }

    /**
     * 声明一个队列（和Fanout类型交换器绑定）
     *
     * @return
     */
    @Bean
    public Queue demoFanoutQueue01() {
        return new Queue("ZW_FANOUT_DEMO_QUEUE_01", true, false, false, null);
    }

    @Bean
    public Binding fanout01() {
        return new Binding("ZW_FANOUT_DEMO_QUEUE_01", Binding.DestinationType.QUEUE, "ZW_FANOUT_DEMO_EXCHANGE", "", null);
    }

    /**
     * 声明一个队列（和Fanout类型交换器绑定）
     *
     * @return
     */
    @Bean
    public Queue demoFanoutQueue02() {
        return new Queue("ZW_FANOUT_DEMO_QUEUE_02", true, false, false, null);
    }

    @Bean
    public Binding fanout02() {
        return new Binding("ZW_FANOUT_DEMO_QUEUE_02", Binding.DestinationType.QUEUE, "ZW_FANOUT_DEMO_EXCHANGE", "", null);
    }
}