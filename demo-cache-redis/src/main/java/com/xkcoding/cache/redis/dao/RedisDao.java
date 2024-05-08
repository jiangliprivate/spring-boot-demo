package com.xkcoding.cache.redis.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.io.Serializable;

//在容器中添加bean,很像单例,既然是单例就得new
@Component
public class RedisDao {
    //@Autowired
    private StringRedisTemplate stringRedisTemplate;

    //@Autowired
    private RedisTemplate<String, Serializable> redisCacheTemplate;

    @Autowired
    public RedisDao(StringRedisTemplate stringRedisTemplate, RedisTemplate<String, Serializable> redisCacheTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
        this.redisCacheTemplate = redisCacheTemplate;
    }

    public StringRedisTemplate getStringRedisTemplate() {
        return stringRedisTemplate;
    }

    public RedisTemplate<String, Serializable> getRedisCacheTemplate() {
        return redisCacheTemplate;
    }
}
