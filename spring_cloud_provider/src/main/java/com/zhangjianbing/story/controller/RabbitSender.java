package com.zhangjianbing.story.controller;

import com.zhangjianbing.story.config.RabbitConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author 张建兵 Ryan
 * time 2019/4/15
 */
@RestController
public class RabbitSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @GetMapping("/sendMessage")
    public void sendMessage() {
        String context = "hello " + new Date();
        System.out.println("Sender : " + context);
        rabbitTemplate.convertAndSend(RabbitConfig.EXCHANGE_NAME, RabbitConfig.ROUTING_KEY, context);
    }

}
