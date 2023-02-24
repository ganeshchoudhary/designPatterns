package com.gschoudhary.design.patterns.structural.decorator.example1;

public class WithAlloyWheel extends CarDecorator {
    WithAlloyWheel(Car car) throws Exception {
        super(car);
    }

    @Override
    public int getCarPrice() {
        return car.getCarPrice() + 10000;
    }

    @Override
    public String getCarDetails() {
        return car.getCarDetails() + " with alloy wheel";
    }
}
