package com.luke.springcloud.controller;

import com.luke.springcloud.entities.CommonResult;
import com.luke.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 廖水生
 * @date 2020/11/7 17:12
 * @desc
 */
@RestController
public class OrderController {
    //    public static final String URL = "http://127.0.0.1:8001";
    //实现负载均衡
    public static final String URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    RestTemplate restTemplate;

    @PostMapping("/consumet/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        return restTemplate.postForObject(URL + "/payment/create", payment, CommonResult.class);
    }


    @GetMapping("/consumet/payment/get/{id}")
    public CommonResult getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(URL + "/payment/get/" + id, CommonResult.class);
    }


}
