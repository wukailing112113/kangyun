package com.kangyun.kangyungatewaycenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
@EnableFeignClients
public class KangyunGatewayCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(KangyunGatewayCenterApplication.class, args);
    }

}
