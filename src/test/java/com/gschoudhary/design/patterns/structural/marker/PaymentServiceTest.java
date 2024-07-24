package com.gschoudhary.design.patterns.structural.marker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bytecoder.design.patterns.structural.marker.BharatPayPaymentService;
import com.bytecoder.DesignPatterns.structural.marker.MarkerInterface;
import com.bytecoder.DesignPatterns.structural.marker.PaymentService;
import com.bytecoder.design.patterns.structural.marker.PaytmPaymentService;
import com.bytecoder.design.patterns.structural.marker.PhonePayPaymentService;

import java.util.ArrayList;
import java.util.List;

class PaymentServiceTest {
    List<PaymentService> paymentServiceList;


    @BeforeEach
    void setUp() {
        paymentServiceList = new ArrayList<>();
        paymentServiceList.add(new PaytmPaymentService());
        paymentServiceList.add(new BharatPayPaymentService());
        paymentServiceList.add(new PhonePayPaymentService());
    }

    @Test
    void execute() {
        for (PaymentService paymentService:
             paymentServiceList) {
            if(paymentService instanceof MarkerInterface){
                System.out.println("marker service");
                continue;
            }
            paymentService.execute("payment");
        }
    }
}