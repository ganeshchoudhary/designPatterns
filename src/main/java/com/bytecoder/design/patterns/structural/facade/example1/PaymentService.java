package com.bytecoder.design.patterns.structural.facade.example1;

public abstract class PaymentService {
    public final void makePayment(){
        userDetail();
        addressDetail();
        orderDetail();
        warehouseDetail();
        paymentDetail();
    }

    protected abstract void userDetail();
    protected abstract void addressDetail();
    protected abstract void orderDetail();

    protected abstract void warehouseDetail();
    protected abstract void paymentDetail() ;
}
