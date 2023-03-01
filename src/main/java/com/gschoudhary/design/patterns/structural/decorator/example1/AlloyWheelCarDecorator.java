package com.gschoudhary.design.patterns.structural.decorator.example1;

public class AlloyWheelCarDecorator extends CarDecorator {
    AlloyWheelCarDecorator(Car car) {
        super(car);
    }

    @Override
    public int getCarPrice() {
        return car.getCarPrice() + 50000;
    }

    @Override
    public String getCarDetails() {
        return car.getCarDetails() + " with alloy wheel";
    }
}
