package com.muniao.dockerdemo;

import com.alibaba.fastjson.JSONObject;
import com.muniao.dockerdemo.vo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest
{


    @Autowired
    private StringRedisTemplate strRedis;

    @Test
    public void test4()
    {
        strRedis.opsForValue().set("mycache", "我存入的第一个cache");

        User user = new User();
        user.setAddress("地址");
        user.setCreatetime(new Date());
        strRedis.opsForValue().set("user", JSONObject.toJSONString(user));

        String string = strRedis.opsForValue().get("user");
        User user1 = JSONObject.parseObject(string, User.class);
        System.out.println(user1);

    }

}
