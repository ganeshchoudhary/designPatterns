package com.gschoudhary.design.patterns.structural.facade;

public class UPIPaymentImpl implements Payment{
    @Override
    public void makePayment() {
        System.out.println("making the making with upi.");
    }
}
