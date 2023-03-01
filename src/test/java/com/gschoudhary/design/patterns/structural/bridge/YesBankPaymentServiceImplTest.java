package com.gschoudhary.design.patterns.structural.bridge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YesBankPaymentServiceImplTest {
    YesBankPaymentServiceImpl yesBankPaymentService;

    @BeforeEach
    void setUp() {

    }

    @Test
    void makePayment() {
        yesBankPaymentService = new YesBankPaymentServiceImpl(new CashPaymentModeService());
        yesBankPaymentService.makePayment();

        yesBankPaymentService = new YesBankPaymentServiceImpl(new UPIPaymentModeService());
        yesBankPaymentService.makePayment();
    }
}