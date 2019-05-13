package com.springcloud.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client", fallback = ServiceHiHystric.class)
public interface ServiceHi {

    @GetMapping("/hi")
    String sayHi(@RequestParam(value = "name") String name);
}
