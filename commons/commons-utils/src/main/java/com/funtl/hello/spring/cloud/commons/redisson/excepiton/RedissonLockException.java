package com.funtl.hello.spring.cloud.commons.redisson.excepiton;

/**
 * 自定义分布式锁异常
 * <p>
 * Description:
 * </p>
 *
 * @author Lusifer
 * @version v1.0.0
 * @date 2019-12-08 22:41:26
 * @see com.funtl.hello.spring.cloud.commons.redisson.excepiton
 */
public class RedissonLockException extends RuntimeException {

    public RedissonLockException() {
    }

    public RedissonLockException(String message) {
        super(message);
    }

    public RedissonLockException(String message, Throwable cause) {
        super(message, cause);
    }

    public RedissonLockException(Throwable cause) {
        super(cause);
    }

    public RedissonLockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
