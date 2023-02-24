package com.gschoudhary.design.patterns.creational.factorymethod;

import com.gschoudhary.design.patterns.creational.Bank;

class HDFCBank implements Bank {
    @Override
    public void printDetails() {
        System.out.println("Hdfc bank details");
    }
}
