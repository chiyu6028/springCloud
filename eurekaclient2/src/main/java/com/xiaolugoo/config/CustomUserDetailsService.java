package com.xiaolugoo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * 模拟两个账户
 * Created by chinaD on 2017/12/19.
 */
@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        if ("user".equals(s)){
            return new SecurityUser("user","123456","user-role");
        } else if ("admin".equals(s)){
            return new SecurityUser("admin","123456","admin-role");
        } else {
            return null;
        }
    }
}
