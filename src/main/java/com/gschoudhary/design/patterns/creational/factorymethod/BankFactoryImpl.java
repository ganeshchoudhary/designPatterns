package com.gschoudhary.design.patterns.creational.factorymethod;

import com.gschoudhary.design.patterns.creational.Bank;
import com.gschoudhary.design.patterns.creational.BankFactory;
import com.gschoudhary.design.patterns.creational.factorymethod.HDFCBank;
import com.gschoudhary.design.patterns.creational.factorymethod.IciciBank;

class BankFactoryImpl implements BankFactory {
    @Override
    public Bank getBank(String name) {
        if (name.equals("HDFC")) {
            return new HDFCBank();
        }
        if (name.equals("ICICI")) {
            return new IciciBank();
        }
        return null;
    }
}
