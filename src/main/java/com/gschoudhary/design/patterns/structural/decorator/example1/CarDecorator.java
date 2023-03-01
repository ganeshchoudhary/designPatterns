package com.gschoudhary.design.patterns.structural.decorator.example1;

public abstract class CarDecorator implements Car {
    protected Car car;

    CarDecorator(Car car)  {
        this.car=car;
    }

}
