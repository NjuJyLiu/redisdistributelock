package com.redisdistribution.mylock.bean;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * Description: 配置redisTemplate类
 *
 * @author Liujy On 2018/8/14.
 * @version 1.0
 * @since JDK 1.8
 */
@Configuration
@EnableCaching
public class RedisCacheConfig {

    /**
     * 构造一个stringRedisTemplate的bean
     * @param factory 传入的JedisConnectionFactory,由{@link org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration}生成
     * @return 构造出来的stringRedisTemplate
     */
    @Bean(name = "redisTemplate")
    public StringRedisTemplate stringRedisTemplate(JedisConnectionFactory factory) {
        StringRedisTemplate redisTemplate = new StringRedisTemplate(factory);
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        redisTemplate.afterPropertiesSet();
        return redisTemplate;
    }

}
