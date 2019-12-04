package com.funtl.hello.spring.cloud.business.controller;

import com.funtl.hello.spring.cloud.business.feign.BusinessAdminFeign;
import com.netflix.config.DynamicPropertyFactory;
import com.netflix.config.DynamicStringProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RefreshScope
@RestController
public class BusinessAdminController {

    @Resource
    private BusinessAdminFeign adminFeign;

    @GetMapping(value = "hi")
    public String sayHi() {
        return adminFeign.sayHi();
    }

    @GetMapping(value = "hello")
    public String sayHello() {
        DynamicStringProperty property = DynamicPropertyFactory.getInstance().getStringProperty("demo.message", "Hello World");
        return property.getValue();
    }
}
