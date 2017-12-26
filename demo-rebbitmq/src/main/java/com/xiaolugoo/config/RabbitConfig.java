package com.xiaolugoo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;

/**
 * Created by chinaD on 2017/12/26.
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue helloQueue() {
        return  new Queue("hello",true);
    }
}
