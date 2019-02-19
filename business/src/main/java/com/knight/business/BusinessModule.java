package com.knight.business;

import com.knight.PaymentService;

import java.util.Iterator;
import java.util.ServiceLoader;

public class BusinessModule {
    public static void run(){
        Iterator<PaymentService> serviceIterator = ServiceLoader.load(PaymentService.class).iterator();
        if (serviceIterator.hasNext()){
            PaymentService paymentService = serviceIterator.next();
            paymentService.pay("Q币充值",100.00);
        }else {
            System.out.println("未找到支付模块");
        }
    }
}
