package com.gschoudhary.design.patterns.structural.facade.example1;

public class UPIPaymentImpl implements Payment{
    @Override
    public void makePayment() {
        System.out.println("making the making with upi.");
    }
}
