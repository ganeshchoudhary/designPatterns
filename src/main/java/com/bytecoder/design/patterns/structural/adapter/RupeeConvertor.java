package com.bytecoder.design.patterns.structural.adapter;

public class RupeeConvertor implements CurrencyConvertor {
    private double value;

    private CurrencyType currencyType;

    RupeeConvertor(int value, CurrencyType currencyType) {
        this.value = value;
        this.currencyType = currencyType;
    }

    @Override
    public Rupees getRupees() {
        if (currencyType.equals(CurrencyType.RUPEE)) {
            return new Rupees(this.value);
        } else if (currencyType.equals(CurrencyType.DOLLAR)) {
            return new Rupees(this.value * 80);
        } else if (currencyType.equals(CurrencyType.BHAT)) {
            return new Rupees(this.value * 2.5);
        }
        throw new RuntimeException("Not convertable");
    }
}
