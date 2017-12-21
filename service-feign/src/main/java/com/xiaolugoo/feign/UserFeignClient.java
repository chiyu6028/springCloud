package com.xiaolugoo.feign;

import com.xiaolugoo.entity.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *  使用@FeignClient的configuration属性，指定feign的配置类。
 * Created by chinaD on 2017/12/20.
 */
//@FeignClient(name = "service-hi")
public interface UserFeignClient {

    //@RequestLine("GET /{id}")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);
}
