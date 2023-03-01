package com.gschoudhary.design.patterns.structural.bridge;

public class CashPaymentModeService implements PaymentMode {
    public String paymentMode;

    CashPaymentModeService() {
        this.paymentMode = "Cash";
    }

    @Override
    public String getPaymentMode() {
        return this.paymentMode;
    }

    @Override
    public String makePayment() {
        return "making payment with Cash";
    }
}
