package com.springcloud.servicefeign.controller;

import com.springcloud.servicefeign.service.ServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 19/1/22 下午4:00
 * @Auther znq
 * @ClassName FeginHelloController
 **/
@RestController
public class FeginHelloController {

    @Autowired
    private ServiceHi serviceHi;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String name) {
        return serviceHi.sayHi(name);
    }

}
