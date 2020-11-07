package com.luke.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 廖水生
 * @date 2020/11/7 19:34
 * @desc
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8022 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8022.class, args);
    }
}
