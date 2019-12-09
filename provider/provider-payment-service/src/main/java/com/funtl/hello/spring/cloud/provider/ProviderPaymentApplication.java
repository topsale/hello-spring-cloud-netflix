package com.funtl.hello.spring.cloud.provider;

import com.funtl.hello.spring.cloud.provider.message.MessageSink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import tk.mybatis.spring.annotation.MapperScan;

@EnableEurekaClient
@EnableBinding({MessageSink.class})
@MapperScan(basePackages = {"com.funtl.hello.spring.cloud.provider.mapper"})
@SpringBootApplication(scanBasePackages = "com.funtl.hello.spring.cloud")
public class ProviderPaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderPaymentApplication.class, args);
    }

}
