package com.gschoudhary.design.patterns.bahavioral.state;

public class AccountReadyState extends StateContext {

    AccountReadyState(Customer customer) {
        super(customer);
    }

    @Override
    public void performAction() {
        System.out.println("account is ready");
        super.customer.setCustomerState(CustomerState.READY_TO_PAY);
    }
}
