package com.luke.springcloud.controller;

import com.luke.springcloud.entities.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author 廖水生
 * @date 2020/11/8 0:45
 * @desc
 */

@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "payment/zk")
    public CommonResult paymentZk() {
        return new CommonResult(200, "获取信息成功", UUID.randomUUID().toString(), port);
    }
}
