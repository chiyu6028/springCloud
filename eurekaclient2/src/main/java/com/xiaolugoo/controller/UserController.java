package com.xiaolugoo.controller;

import com.xiaolugoo.dao.UserRepository;
import com.xiaolugoo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chinaD on 2017/12/18.
 */
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        User user = userRepository.findOne(id);
        return user;
    }
}
