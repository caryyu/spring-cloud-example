package com.naked.cloud.service.doorlock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
public class ServiceDoorLockApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDoorLockApplication.class, args);
    }

//    @Component
//    class StatusRunner implements CommandLineRunner {
//        @Autowired
//        protected DiscoveryClient discoveryClient;
//
//        @Override
//        public void run(String... args) throws Exception {
//            List<ServiceInstance> list = discoveryClient.getInstances("service-wifi");
//            System.out.println(list);
//        }
//    }
}
