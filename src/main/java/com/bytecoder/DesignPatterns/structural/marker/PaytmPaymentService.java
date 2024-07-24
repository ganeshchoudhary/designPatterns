package com.bytecoder.DesignPatterns.structural.marker;

import org.springframework.stereotype.Service;

@Service
public class PaytmPaymentService implements MarkerInterface, PaymentService{
    @Override
    public void execute(String str) {
        System.out.println("Executing paytm payment service");
    }
}
