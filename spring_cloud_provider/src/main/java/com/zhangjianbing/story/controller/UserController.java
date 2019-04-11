package com.zhangjianbing.story.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 此种模式是让web调用的对外接口
 * @author zhangjianbing
 * time 2019/4/11
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @RequestMapping("/msg")
    public String userMsg() {
        return "hello,bing!";
    }

}
