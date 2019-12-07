package com.funtl.hello.spring.cloud.provider.cache;

import com.funtl.hello.spring.cloud.commons.redisson.operation.RedissonObject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class RedissonObjectTests {

    @Resource
    private RedissonObject redissonObject;

    @Test
    public void testSet() {
        redissonObject.setValue("name", "李小璐");
    }

    @Test
    public void testGet() {
        Object name = redissonObject.getValue("name");
        System.out.println(name);
    }

    @Test
    public void testDelete() {
        redissonObject.delete("name");
    }

}
