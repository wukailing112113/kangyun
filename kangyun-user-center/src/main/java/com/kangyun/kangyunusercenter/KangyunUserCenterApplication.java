package com.kangyun.kangyunusercenter;

import com.kangyun.kangyunusercenter.config.ConsulConfigDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties({ConsulConfigDemo.class})
public class KangyunUserCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(KangyunUserCenterApplication.class, args);
    }

}
