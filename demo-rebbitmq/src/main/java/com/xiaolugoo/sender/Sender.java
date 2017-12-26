package com.xiaolugoo.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by chinaD on 2017/12/26.
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate rabbitmq;

    public void send() {
        String context = "hello " + new Date();

        System.out.println("Sender:"+ context);

        this.rabbitmq.convertAndSend("hello",context);
    }
}
