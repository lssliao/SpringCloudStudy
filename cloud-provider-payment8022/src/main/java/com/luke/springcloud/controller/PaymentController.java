package com.luke.springcloud.controller;

import com.luke.springcloud.entities.CommonResult;
import com.luke.springcloud.entities.Payment;
import com.luke.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 廖水生
 * @date 2020/11/7 16:12
 * @desc
 */
@Slf4j
@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult<CommonResult> add(@RequestBody Payment payment) {
        int id = paymentService.create(payment);
        log.info("插入结果：" + id);
        if (id > 0) {
            return new CommonResult<>(200, "插入成功：" + id);
        } else {
            return new CommonResult<>(200, "插入成功：" + id);
        }
    }


    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("-------------查询结果:[{}]", payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功,端口号: " + payment);
        } else {
            return new CommonResult(444, "没有对应记录,查询 ID: " + id, null);
        }
    }

}
