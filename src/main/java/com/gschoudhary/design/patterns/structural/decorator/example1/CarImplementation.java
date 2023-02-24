package com.gschoudhary.design.patterns.structural.decorator.example1;

public class CarImplementation implements Car {
    private String name;

    private int price;

    private String model;

    public CarImplementation(String name) {
        this.model = "XSL";
        this.name = name;
        this.price = 1000000;
    }

    @Override
    public int getCarPrice() {
        return this.price;
    }

    @Override
    public String getCarDetails() {
        return this.name + " " + this.model;
    }
}
