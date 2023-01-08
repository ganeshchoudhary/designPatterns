package com.gschoudhary.design.patterns.structural.facade;

interface PaymentService {
    void makePaymentWithUpi();

    void makePaymentWithDebitCard();

    void makePaymentWithCreditCard();
}
