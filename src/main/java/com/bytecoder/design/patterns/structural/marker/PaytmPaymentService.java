package com.bytecoder.design.patterns.structural.marker;

import org.springframework.stereotype.Service;

@Service
public class PaytmPaymentService implements MarkerInterface, PaymentService{
    @Override
    public void execute(String str) {
        System.out.println("Executing paytm payment service");
    }
}
