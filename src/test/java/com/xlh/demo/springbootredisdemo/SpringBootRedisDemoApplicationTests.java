package com.xlh.demo.springbootredisdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class SpringBootRedisDemoApplicationTests {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;
    @Test
    void contextLoads() {
        redisTemplate.opsForValue().set("key1", "value1");
    }

}
