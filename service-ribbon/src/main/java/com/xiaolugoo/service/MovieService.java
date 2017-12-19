package com.xiaolugoo.service;

import com.xiaolugoo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by chinaD on 2017/12/18.
 */
@Service
public class MovieService {

    @Autowired
    private RestTemplate restTemplate;

    public User findById(Long id){
        return  restTemplate.getForObject("http://SERVICE-HI/"+id,User.class);
    }
}
