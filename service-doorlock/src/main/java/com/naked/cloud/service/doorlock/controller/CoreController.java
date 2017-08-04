package com.naked.cloud.service.doorlock.controller;

import com.naked.cloud.service.doorlock.restservice.ServiceWifiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CoreController {
    @Autowired
    protected ServiceWifiClient serviceWifiClient;

    @RequestMapping("/test")
    public String test(String name) {
        return serviceWifiClient.sayHello(name);
    }

    @RequestMapping("/sayHello")
    public String sayHello(String who){
        return "你好:" + who + ";我是门禁服务";
    }
}