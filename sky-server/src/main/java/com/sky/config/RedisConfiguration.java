package com.sky.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @Author Java小猪
 * @Date 2025/2/26 10:42
 */
@Configurable
@Slf4j
public class RedisConfiguration {

    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
        log.info("开始创建redis模板对象...");
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        // 设置redis的连接工厂对象
        template.setConnectionFactory(factory);
        // 设置redis key的序列化器
        template.setKeySerializer(new StringRedisSerializer());
        return template;
    }
}