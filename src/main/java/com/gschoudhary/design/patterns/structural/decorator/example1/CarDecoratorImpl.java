package com.gschoudhary.design.patterns.structural.decorator.example1;

public class CarDecoratorImpl extends CarDecorator {
    public CarDecoratorImpl(Car car) throws Exception {
        super(car);
    }

    public CarDecoratorImpl addAlloyWheel() throws Exception {
        return new CarDecoratorImpl(new CarImplementation("alloy wheel added " + car.getCarDetails()));
    }

    public CarDecoratorImpl addColor( String color) throws Exception {
        return new CarDecoratorImpl(new CarImplementation("color added " + color + car.getCarDetails()));
    }

    @Override
    public int getCarPrice() {
        return car.getCarPrice();
    }

    @Override
    public String getCarDetails() {
        return car.getCarDetails();
    }
}
