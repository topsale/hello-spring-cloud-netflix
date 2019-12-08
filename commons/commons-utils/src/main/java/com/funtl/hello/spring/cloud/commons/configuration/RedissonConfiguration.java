package com.funtl.hello.spring.cloud.commons.configuration;

import com.funtl.hello.spring.cloud.commons.redisson.aop.RedissonLockAop;
import com.funtl.hello.spring.cloud.commons.redisson.operation.RedissonBinary;
import com.funtl.hello.spring.cloud.commons.redisson.operation.RedissonCollection;
import com.funtl.hello.spring.cloud.commons.redisson.operation.RedissonObject;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonConfiguration {

    @Bean
    @ConditionalOnMissingBean(RedissonLockAop.class)
    public RedissonLockAop redissonLockAop() {
        return new RedissonLockAop();
    }

    @Bean
    @ConditionalOnMissingBean(RedissonObject.class)
    public RedissonObject redissonObject() {
        return new RedissonObject();
    }

    @Bean
    @ConditionalOnMissingBean(RedissonBinary.class)
    public RedissonBinary redissonBinary() {
        return new RedissonBinary();
    }

    @Bean
    @ConditionalOnMissingBean(RedissonCollection.class)
    public RedissonCollection redissonCollection() {
        return new RedissonCollection();
    }

}
