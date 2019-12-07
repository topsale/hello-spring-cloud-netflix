package com.funtl.hello.spring.cloud.provider.cache;

import com.funtl.hello.spring.cloud.commons.cache.LettuceUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class LettuceUtilsTests {

    @Resource
    private LettuceUtils lettuceUtils;

    @Test
    public void testSet() {
        lettuceUtils.set("name", "李小红");
    }

    @Test
    public void testGet() {
        System.out.println(lettuceUtils.get("name"));
    }

    @Test
    public void testDelete() {
        lettuceUtils.delete("name");
    }
}
