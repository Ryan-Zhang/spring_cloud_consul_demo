package com.zhangjianbing.story.controller;

import com.zhangjianbing.story.service.IUserService;
import org.springframework.web.bind.annotation.RestController;

/**
 * 此种模式只能够应用内部调用
 * @author zhangjianbing
 * time 2019/4/11
 */
@RestController
public class PersonController implements IUserService {


    @Override
    public String getUserInfo() {
        return "Hello,70KG!";
    }

    @Override
    public String getInfo() {
        return "hello 2";
    }

}
