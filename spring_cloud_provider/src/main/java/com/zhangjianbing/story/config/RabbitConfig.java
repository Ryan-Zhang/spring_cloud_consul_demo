package com.zhangjianbing.story.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 张建兵 Ryan
 * time 2019/4/15
 */
@Configuration
public class RabbitConfig {

    /**
     * 队列名
     */
    public final static String QUEUE_NAME = "game-server-queue";

    /**
     * 交换机名
     */
    public final static String EXCHANGE_NAME = "game-server-exchange";

    /**
     * 路由键
     */
    public final static String ROUTING_KEY = "game-server-key";

    // 创建队列
    @Bean
    public Queue queue() {
        return new Queue(QUEUE_NAME);
    }

    // 创建一个 topic 类型的交换器
    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(EXCHANGE_NAME);
    }

    // 使用路由键（routingKey）把队列（Queue）绑定到交换器（Exchange）
    @Bean
    public Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY);
    }

    @Bean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory("10.231.34.231", 5672);
        connectionFactory.setUsername("girlfriend-sit");
        connectionFactory.setPassword("5X62isqJk5XH4BNg");
        connectionFactory.setVirtualHost("girlfriend-sit");
        return connectionFactory;
    }

    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
        return new RabbitTemplate(connectionFactory);
    }
}
