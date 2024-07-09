package com.bytecoder.design.patterns.structural.marker;

import org.springframework.stereotype.Service;

@Service
public class PhonePayPaymentService implements PaymentService{
    @Override
    public void execute(String str) {
        System.out.println("Executing phonePay payment service");
    }
}
