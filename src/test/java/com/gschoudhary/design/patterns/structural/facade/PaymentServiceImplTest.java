package com.gschoudhary.design.patterns.structural.facade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentServiceImplTest {

    PaymentService paymentService= new PaymentServiceImpl();

    @BeforeEach
    void setUp() {
    }

    @Test
    void makePaymentWithUpi() {
        paymentService.makePaymentWithUpi();
    }

    @Test
    void makePaymentWithDebitCard() {
        paymentService.makePaymentWithDebitCard();
    }

    @Test
    void makePaymentWithCreditCard() {
        paymentService.makePaymentWithCreditCard();
    }
}