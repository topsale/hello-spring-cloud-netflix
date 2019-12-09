package com.funtl.hello.spring.cloud.provider.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MessageReceive {

    @StreamListener("MessageTopic")
    public void receive(String message) {
        log.info("接收：" + message);
    }

}
