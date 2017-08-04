package com.naked.cloud.service.doorlock.restservice;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class ServiceWifiClientFallback implements ServiceWifiClient {
    @Override
    public String sayHello(@RequestParam("who") String who) {
        return "Service-Wifi unavailable";
    }
}