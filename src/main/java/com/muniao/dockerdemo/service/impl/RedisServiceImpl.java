package com.muniao.dockerdemo.service.impl;

import com.muniao.dockerdemo.service.RedisService;
import org.springframework.stereotype.Service;

@Service
public class RedisServiceImpl implements RedisService
{


    @Override
    public void setValue(String key, String value)
    {
    }

    @Override
    public String getValue(String key)
    {
        return "";
    }
}
