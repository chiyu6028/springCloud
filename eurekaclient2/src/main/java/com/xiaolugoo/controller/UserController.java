package com.xiaolugoo.controller;

import com.xiaolugoo.dao.UserRepository;
import com.xiaolugoo.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by chinaD on 2017/12/18.
 */
@RestController
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserRepository userRepository;

    /*
    * 自动feign
    * */
    /*@GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        User user = userRepository.findOne(id);
        return user;
    }*/

    /*
    * 手动feign
    * */
    @GetMapping("/{id}")
    public User findByIdUser(@PathVariable Long id){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails){
            UserDetails user = (UserDetails) principal;
            Collection<? extends GrantedAuthority> collection = user.getAuthorities();
            for (GrantedAuthority c: collection){
                logger.info("当前用户是{},当前角色是{}",user.getUsername(),c.getAuthority());
            }
        }
        User  findOne = userRepository.findOne(id);
        return findOne;
    }
}
