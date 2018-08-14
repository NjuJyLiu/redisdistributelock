package com.redisdistribution.mylock.lock;

/**
 * Description: 分布式锁接口
 *
 * @author Liujy On 2018/8/14.
 * @version 1.0
 * @since JDK 1.
 */
public interface RedisDistributionLock {

    /**
     * 获取分布式锁
     * @param lockKey 键
     * @param requestId 请求客户端id
     * @param expireTime 过期时间
     * @return 返回是否请求锁成功
     */
    boolean getDistributedLock(String lockKey, String requestId, int expireTime);

    /**
     * 释放分布式锁
     * @param lockKey 键
     * @param requestId 请求客户端id
     * @return 返回是否解锁成功
     */
    boolean releaseDistributedLock(String lockKey, String requestId);
}
