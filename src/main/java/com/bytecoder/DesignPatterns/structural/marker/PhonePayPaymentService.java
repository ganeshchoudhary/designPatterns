package com.bytecoder.DesignPatterns.structural.marker;

import org.springframework.stereotype.Service;

@Service
public class PhonePayPaymentService implements PaymentService{
    @Override
    public void execute(String str) {
        System.out.println("Executing phonePay payment service");
    }
}
