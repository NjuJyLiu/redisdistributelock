package com.redisdistribution.mylock.lock.impl;

import com.redisdistribution.mylock.lock.RedisDistributionLock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import javax.annotation.Resource;

/**
 * Description:
 *
 * @author Liujy On 2018/8/14.
 * @version 1.0
 * @since JDK 1.
 */
public class RedisDistributionLockImpl implements RedisDistributionLock {

    private static final Logger LOG = LoggerFactory.getLogger(RedisDistributionLockImpl.class);

    /**
     * spring提供的redis封装类(需要先配置成为一个bean）{@link com.redisdistribution.mylock.bean.RedisCacheConfig}
     */
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public boolean getDistributedLock(String lockKey, String requestId, int expireTime) {
        return true;
    }

    @Override
    public boolean releaseDistributedLock(String lockKey, String requestId) {
        return false;
    }
}
