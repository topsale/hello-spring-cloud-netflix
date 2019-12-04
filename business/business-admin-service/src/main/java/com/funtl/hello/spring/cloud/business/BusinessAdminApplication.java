package com.funtl.hello.spring.cloud.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableHystrix
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.funtl.hello.spring.cloud")
public class BusinessAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusinessAdminApplication.class, args);
    }

}
