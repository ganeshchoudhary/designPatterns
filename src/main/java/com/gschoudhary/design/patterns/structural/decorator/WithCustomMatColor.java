package com.gschoudhary.design.patterns.structural.decorator;

public class WithCustomMatColor extends CarDecorator {
    private String color;

    WithCustomMatColor(Car car, String color) throws Exception {
        super(car);
        this.color = color;
    }

    @Override
    public int getCarPrice() {
        return car.getCarPrice() + 20000;
    }

    @Override
    public String getCarDetails() {
        return car.getCarDetails() + " with " + this.color + " color ";
    }
}
