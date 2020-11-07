package com.luke.springcloud.service;

import com.luke.springcloud.entities.Payment;

/**
 * @author 廖水生
 * @date 2020/11/7 16:08
 * @desc
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(Long id);
}
