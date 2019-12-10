package com.funtl.hello.spring.cloud.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderAdminController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "hi")
    public String sayHi() {
        return "Hi Eureka, i am from port: " + port;
    }

}
