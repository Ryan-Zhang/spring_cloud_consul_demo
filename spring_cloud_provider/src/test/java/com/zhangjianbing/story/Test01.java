package com.zhangjianbing.story;

import com.zhangjianbing.story.controller.RabbitSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 张建兵 Ryan
 * time 2019/4/15
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProviderApp.class)
public class Test01 {

    @Autowired
    private RabbitSender rabbitSender;

//    @Test
//    public void hello() throws Exception {
//        rabbitSender.send();
//    }

}
