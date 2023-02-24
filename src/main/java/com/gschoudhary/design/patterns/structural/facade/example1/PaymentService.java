package com.gschoudhary.design.patterns.structural.facade.example1;

public interface PaymentService {
    void makePaymentWithUpi();

    void makePaymentWithDebitCard();

    void makePaymentWithCreditCard();
}
