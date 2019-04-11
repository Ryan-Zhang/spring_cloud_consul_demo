package com.zhangjianbing.story.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangjianbing
 * time 2019/4/11
 */
@FeignClient(value = "service-provider-01")
public interface IUserService {

    @RequestMapping("/user/1")
    String getUserInfo();

    @RequestMapping("/user/2")
    String getInfo();

}
