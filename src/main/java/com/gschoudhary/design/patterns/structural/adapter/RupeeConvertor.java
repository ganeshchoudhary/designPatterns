package com.gschoudhary.design.patterns.structural.adapter;

public class RupeeConvertor implements CurrencyConvertor {
    private int value;

    RupeeConvertor(int value) {
        this.value = value;
    }

    @Override
    public Rupees getRupees() {
        return new Rupees(this.value * 100);
    }
}
