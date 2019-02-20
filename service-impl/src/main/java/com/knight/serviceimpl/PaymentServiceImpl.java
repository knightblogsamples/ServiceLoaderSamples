package com.knight.serviceimpl;

import com.google.auto.service.AutoService;
import com.knight.PaymentService;

@AutoService(PaymentService.class)
public class PaymentServiceImpl implements PaymentService {
    @Override
    public void pay(String productName, double price) {
        System.out.println("支付模块:购买产品 "+productName +",价格"+price);
    }
}
