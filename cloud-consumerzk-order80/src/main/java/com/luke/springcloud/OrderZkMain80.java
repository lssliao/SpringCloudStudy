package com.luke.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 廖水生
 * @date 2020/11/8 1:04
 * @desc
 */
@SpringBootApplication
//该注解用于向使用consul或者zookeeper作为注册中心时注册服务
//@EnableDiscoveryClient
public class OrderZkMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderZkMain80.class, args);
    }
}
