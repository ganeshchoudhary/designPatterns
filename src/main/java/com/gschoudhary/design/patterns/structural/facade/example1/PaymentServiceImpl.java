package com.gschoudhary.design.patterns.structural.facade.example1;

public class PaymentServiceImpl implements PaymentService {
    private DebitCardPaymentImpl debitCardPayment = new DebitCardPaymentImpl();

    private CreditCardImpl creditCard = new CreditCardImpl();

    private UPIPaymentImpl upiPayment = new UPIPaymentImpl();

    @Override
    public void makePaymentWithUpi() {
        upiPayment.makePayment();

    }

    @Override
    public void makePaymentWithDebitCard() {
        debitCardPayment.makePayment();
    }

    @Override
    public void makePaymentWithCreditCard() {
        creditCard.makePayment();
    }
}
