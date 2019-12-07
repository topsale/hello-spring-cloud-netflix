package com.funtl.hello.spring.cloud.commons.configuration;

import com.funtl.hello.spring.cloud.commons.redisson.operation.RedissonObject;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonConfiguration {

    @Bean
    @ConditionalOnMissingBean(RedissonObject.class)
    public RedissonObject redissonObject() {
        return new RedissonObject();
    }

}
