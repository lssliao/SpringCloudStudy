package com.luke.springcloud.service.impl;

import com.luke.springcloud.dao.PaymentDao;
import com.luke.springcloud.entities.Payment;
import com.luke.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 廖水生
 * @date 2020/11/7 16:09
 * @desc
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
