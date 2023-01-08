package com.gschoudhary.design.patterns.structural.facade;

public class CreditCardImpl implements Payment{
    @Override
    public void makePayment() {
        System.out.println("Making the payment with credit card.");
    }
}
