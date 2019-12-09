package com.funtl.hello.spring.cloud.addons.producer;

import com.funtl.hello.spring.cloud.addons.message.MessageSource;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MessageProducer {

    @Resource
    private MessageSource source;

    public boolean send(String message) {
        return source.messageTopic().send(MessageBuilder.withPayload(message).build());
    }
}
