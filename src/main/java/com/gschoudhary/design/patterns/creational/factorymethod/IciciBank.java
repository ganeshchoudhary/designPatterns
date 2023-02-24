package com.gschoudhary.design.patterns.creational.factorymethod;

import com.gschoudhary.design.patterns.creational.Bank;

class IciciBank implements Bank {
    @Override
    public void printDetails() {
        System.out.println("Icici bank details");
    }
}
