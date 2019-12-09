package com.funtl.hello.spring.cloud.addons.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MessageSource {

    @Output("MessageTopic")
    MessageChannel messageTopic();
}
