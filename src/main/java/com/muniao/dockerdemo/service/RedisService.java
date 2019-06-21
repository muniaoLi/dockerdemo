package com.muniao.dockerdemo.service;

public interface RedisService
{
    void setValue(String key, String value);
    String getValue(String key);
}
