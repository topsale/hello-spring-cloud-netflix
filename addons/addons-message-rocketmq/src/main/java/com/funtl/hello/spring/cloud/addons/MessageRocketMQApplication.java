package com.funtl.hello.spring.cloud.addons;

import com.funtl.hello.spring.cloud.addons.message.MessageSource;
import com.funtl.hello.spring.cloud.addons.producer.MessageProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

@EnableDiscoveryClient
@SpringBootApplication
@EnableBinding({MessageSource.class})
public class MessageRocketMQApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessageRocketMQApplication.class, args);
    }

    @Bean
    public CustomRunner customRunner() {
        return new CustomRunner();
    }

    public static class CustomRunner implements CommandLineRunner {

        @Resource
        private MessageProducer producer;

        @Override
        public void run(String... args) throws Exception {
            producer.send("测试消息");
        }

    }
}
