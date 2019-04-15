package com.zhangjianbing.story.contorller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author 张建兵 Ryan
 * time 2019/4/15
 */
@Component
@RabbitListener(queues = "spring-boot-queue")
public class RabbitReceiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver  : " + hello);
    }

}
