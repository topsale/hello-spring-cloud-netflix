package com.funtl.hello.spring.cloud.provider.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MessageSink {

    @Input(value = "MessageTopic")
    SubscribableChannel messageTopic();

}
