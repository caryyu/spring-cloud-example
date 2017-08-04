package com.naked.cloud.service.wifi.restservice;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class ServiceDoorlockClientFallback implements ServiceDoorlockClient {
    @Override
    public String sayHello(@RequestParam("who") String who) {
        return "Service-Doorlock unavailable";
    }
}
