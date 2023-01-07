package com.gschoudhary.design.patterns.structural.bridge;

public class YesBankPaymentServiceImpl implements PaymentService {
    private PaymentMode paymentMode;

    YesBankPaymentServiceImpl(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    @Override
    public void makePayment() {

        System.out.println("Making payment with " + paymentMode.getPaymentMode());

    }
}
