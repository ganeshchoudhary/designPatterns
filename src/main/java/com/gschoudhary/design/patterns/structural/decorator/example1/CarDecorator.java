package com.gschoudhary.design.patterns.structural.decorator.example1;

public abstract class CarDecorator implements Car {
    protected Car car;

    CarDecorator(Car car) throws Exception {
        this.car=car;
//        if (car instanceof CarImplementation) {
//            this.car = car;
//        } else {
//            throw new Exception("Decorator is not applicable for " + car.getCarDetails());
//
//        }
    }

}
