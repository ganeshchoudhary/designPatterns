package com.gschoudhary.design.patterns.bahavioral.state.withenum;

import com.gschoudhary.design.patterns.bahavioral.state.Customer;

abstract class StateContext2 {
    protected Customer customer;
    StateContext2(Customer customer){
        this.customer = customer;
    }

    public abstract void performAction();
}
