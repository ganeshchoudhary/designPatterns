package com.gschoudhary.design.patterns.structural.bridge;

public class Main {
    public static void main(String[] args) {
        PaymentMode paymentMode = new PaymentMode("UPI");
        YesBankPaymentServiceImpl yesBankPaymentService = new YesBankPaymentServiceImpl(paymentMode);
        yesBankPaymentService.makePayment();

        paymentMode = new PaymentMode("Cards");
        yesBankPaymentService = new YesBankPaymentServiceImpl(paymentMode);
        yesBankPaymentService.makePayment();
    }
}
