package com.luke.springcloud.cotroller;

import com.luke.springcloud.entities.CommonResult;
import com.luke.springcloud.entities.Payment;
import com.luke.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 廖水生
 * @date 2020/11/8 18:13
 * @desc
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

    /**
     * openfeign-ribbon 客户端一般默认等待1秒钟
     * 在支付服务侧,模拟暂停三秒
     *
     * @return
     */
    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeOut() {
        //客户端默认等待1秒钟
        return paymentFeignService.paymentFeignTimeOut();
    }
}
