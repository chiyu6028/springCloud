package com.xiaolugoo.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * 使用RibbonClient为特定name的Ribbon Client 自定义配置
 * 使用@RibbonClient的configuration属性，为指定的Ribbon指定配置类
 * Created by chinaD on 2017/12/19.
 */
@Configuration
@RibbonClient(name = "service-hi",configuration = RibbonConfiguration.class)
public class TestConfiguration {
}
