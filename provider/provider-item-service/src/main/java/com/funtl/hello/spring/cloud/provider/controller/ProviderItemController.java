package com.funtl.hello.spring.cloud.provider.controller;

import com.funtl.hello.spring.cloud.commons.redisson.annotation.RedissonLock;
import com.funtl.hello.spring.cloud.commons.redisson.enums.RedissonLockModel;
import com.funtl.hello.spring.cloud.provider.domain.TbItem;
import com.funtl.hello.spring.cloud.provider.service.TbItemService;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
public class ProviderItemController {

    @Resource
    private RedissonClient redissonClient;

    @Resource
    private TbItemService tbItemService;

    @PostMapping(value = "num/local")
    public String testNumLock(TbItem tbItem) {
        RLock lock = redissonClient.getLock(tbItem.getName());
        lock.lock();
        log.info("Thread {} 拿到了 {} 的锁", Thread.currentThread().getId(), tbItem.getName());

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        lock.unlock();
        log.info("Thread {} 释放了 {} 的锁", Thread.currentThread().getId(), tbItem.getName());

        return "ok";
    }

    @RedissonLock(keys = "#tbItem.name", lockModel = RedissonLockModel.AUTO)
    @PostMapping(value = "num/annotation")
    public String testNumAnnotation(TbItem tbItem) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "ok";
    }
}
