package com.naked.cloud.service.wifi.restservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "service-doorlock",fallback = ServiceDoorlockClientFallback.class)
public interface ServiceDoorlockClient {
    @RequestMapping(method = RequestMethod.GET, value = "/sayHello")
    String sayHello(@RequestParam("who") String who);
}