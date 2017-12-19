package com.xiaolugoo.service;

import org.springframework.stereotype.Component;

/**
 * Created by chinaD on 2017/12/14.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
