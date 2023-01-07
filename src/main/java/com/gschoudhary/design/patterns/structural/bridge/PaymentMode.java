package com.gschoudhary.design.patterns.structural.bridge;

public class PaymentMode {

    public String paymentMode;

    PaymentMode(String paymentMode){
        this.paymentMode = paymentMode;
    }

    public String getPaymentMode(){
        return this.paymentMode;
    }
}
