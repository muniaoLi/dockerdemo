package com.muniao.dockerdemo.controller;

import com.muniao.dockerdemo.util.RedisStrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController
{
    @Autowired
    RedisStrUtil redisStrUtil;

    @GetMapping("/test")
    public String test()
    {
        return redisStrUtil.get("key1");
    }

}
