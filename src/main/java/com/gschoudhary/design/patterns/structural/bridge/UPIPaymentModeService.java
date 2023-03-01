package com.gschoudhary.design.patterns.structural.bridge;

public class UPIPaymentModeService implements PaymentMode {
    public String paymentMode;

    UPIPaymentModeService() {
        this.paymentMode = "UPI";
    }

    @Override
    public String getPaymentMode() {
        return this.paymentMode;
    }

    @Override
    public String makePayment() {
        return "making payment with UPI";
    }
}
