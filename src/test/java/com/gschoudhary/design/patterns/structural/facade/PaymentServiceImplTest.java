package com.gschoudhary.design.patterns.structural.facade;

import com.gschoudhary.design.patterns.structural.facade.example1.PaymentService;
import com.gschoudhary.design.patterns.structural.facade.example1.PaymentServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PaymentServiceImplTest {

    PaymentService paymentService= new PaymentServiceImpl();

    @BeforeEach
    void setUp() {
    }

    @Test
    void makePaymentWithUpi() {
        paymentService.makePayment();
    }


}