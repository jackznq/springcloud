package com.springcloud.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @Date 19/5/13 下午5:21
 * @Auther znq
 * @ClassName ServiceHiHystric
 **/
@Component
public class ServiceHiHystric implements ServiceHi {

    @Override
    public String sayHi(String name) {
        return "sorry " + name;
    }
}
