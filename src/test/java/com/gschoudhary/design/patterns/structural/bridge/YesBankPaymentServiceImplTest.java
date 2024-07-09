package com.gschoudhary.design.patterns.structural.bridge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bytecoder.design.patterns.structural.bridge.CashPaymentModeService;
import com.bytecoder.design.patterns.structural.bridge.UPIPaymentModeService;
import com.bytecoder.design.patterns.structural.bridge.YesBankPaymentServiceImpl;


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