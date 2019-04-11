package com.zhangjianbing.story.contorller;

import com.zhangjianbing.story.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangjianbing
 * time 2019/4/11
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/info")
    public String getUserInfo() {
        String userInfo = userService.getUserInfo();
        return userInfo;
    }

    @RequestMapping("/msg")
    public String getUserMsg() {
        String userInfo = userService.getInfo();
        return userInfo;
    }

}
