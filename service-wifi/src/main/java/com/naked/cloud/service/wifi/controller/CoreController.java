package com.naked.cloud.service.wifi.controller;

import com.naked.cloud.service.wifi.restservice.ServiceDoorlockClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CoreController {
    @Autowired
    protected ServiceDoorlockClient serviceDoorlockClient;

    @RequestMapping("/test")
    public String test(String name) {
        return serviceDoorlockClient.sayHello(name);
    }

    @RequestMapping("/sayHello")
    public String sayHello(String who){
        return "你好:" + who + ";我是WIFI服务";
    }
}