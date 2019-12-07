package com.funtl.hello.spring.cloud.commons.configuration;

import com.funtl.hello.spring.cloud.commons.cache.LettuceUtils;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LettuceConfiguration {

    @Bean
    @ConditionalOnMissingBean(LettuceUtils.class)
    public LettuceUtils lettuceUtils() {
        return new LettuceUtils();
    }

}
