package com.xiaolugoo.controller;

import com.xiaolugoo.entity.User;
import com.xiaolugoo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by chinaD on 2017/12/18.
 */
@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        User user = movieService.findById(id);
        return user;
    }

    @GetMapping("/user-instance")
    public List<ServiceInstance> showInfo(){
        return discoveryClient.getInstances("service-hi");
    }
}
