package com.luke.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 廖水生
 * @date 2020/11/28 19:18
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3356 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3356.class, args);
    }
}
