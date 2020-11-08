package com.luke.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 廖水生
 * @date 2020/11/8 14:49
 * @desc
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced
    //使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}