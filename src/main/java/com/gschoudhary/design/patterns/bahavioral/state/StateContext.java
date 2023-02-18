package com.gschoudhary.design.patterns.bahavioral.state;

abstract class StateContext {
    protected Customer customer;
    StateContext(Customer customer){
        this.customer = customer;
    }

    public abstract void performAction();
}
