package com.gschoudhary.design.patterns.structural.facade.example1;

public class DebitCardPaymentImpl implements Payment{
    @Override
    public void makePayment() {
        System.out.println("making the payment with debit card. ");
    }
}
