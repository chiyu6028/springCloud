package com.xiaolugoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/*
* zuul 路由功能开启 http://localhost:8769/api-b/hi?name=forezp，http://localhost:8769/api-a/hi?name=forezp
* */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ServiceZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceZuulApplication.class, args);
	}
}
