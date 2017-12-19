package com.xiaolugoo.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 该类为Ribbon的配置类
 * 注意，该类不在主应用程序上下午的@ComponentScan中
 * Created by chinaD on 2017/12/19.
 */
@Configuration
public class RibbonConfiguration {

    @Bean
    public IRule ribbonRule(){
        //负载均衡改为随机
        return new RandomRule();
    }
}
