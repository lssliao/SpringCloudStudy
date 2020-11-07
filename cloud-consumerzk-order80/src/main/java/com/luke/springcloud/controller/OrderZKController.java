package com.luke.springcloud.controller;

import com.luke.springcloud.entities.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 廖水生
 * @date 2020/11/8 1:06
 * @desc
 */
@RestController
@Slf4j
public class OrderZKController {
    //集群模式
//    public static final String INVOKE_URL = "http://cloud-provider-payment";
    //单机模式
    public static final String INVOKE_URL = "http://127.0.0.1:8004";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/zk")
    public CommonResult paymentInfo() {
        return restTemplate.getForObject(INVOKE_URL + "/payment/zk", CommonResult.class);
    }


}
