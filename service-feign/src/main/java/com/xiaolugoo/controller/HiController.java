package com.xiaolugoo.controller;

import com.xiaolugoo.service.SchedualServiceHi;
import feign.Client;
import feign.Contract;
import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClientsConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.*;

/**
 * Created by chinaD on 2017/12/14.
 */
@RestController
@Import(FeignClientsConfiguration.class)
public class HiController {

    private SchedualServiceHi userhi;

    private SchedualServiceHi adminHi;


    @GetMapping(value = "/user-user/hi")
    public String sayHiUser(@RequestParam String name){
        return userhi.sayHiFromClientOne(name);
    }

    @GetMapping(value = "/user-admin/hi")
    public String sayHiAdmin(@RequestParam String name){
        return adminHi.sayHiFromClientOne(name);
    }

    @Autowired
    public HiController(Decoder decoder, Encoder encoder, Client client, Contract contract) {
        // 这边的decoder、encoder、client、contract，可以debug看看是什么实例。
        this.userhi = Feign.builder().client(client).encoder(encoder).decoder(decoder).contract(contract)
                .requestInterceptor(new BasicAuthRequestInterceptor("user", "123456"))
                .target(SchedualServiceHi.class, "http://service-hi/");

        this.adminHi = Feign.builder().client(client).encoder(encoder).decoder(decoder).contract(contract)
                .requestInterceptor(new BasicAuthRequestInterceptor("admin", "123456"))
                .target(SchedualServiceHi.class, "http://service-hi/");
    }

}
