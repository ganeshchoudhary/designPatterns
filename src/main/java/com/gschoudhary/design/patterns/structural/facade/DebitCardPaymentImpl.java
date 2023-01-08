package com.gschoudhary.design.patterns.structural.facade;

public class DebitCardPaymentImpl implements Payment{
    @Override
    public void makePayment() {
        System.out.println("making the payment with debit card. ");
    }
}
