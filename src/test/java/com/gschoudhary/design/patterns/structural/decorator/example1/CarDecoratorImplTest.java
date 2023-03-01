package com.gschoudhary.design.patterns.structural.decorator.example1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarDecoratorImplTest {
    Car car = new CarImplementation("Honda City", "SX", 1500000);

    @BeforeEach
    void setUp() {
        System.out.println(car.getCarDetails() + " " + car.getCarPrice());
    }

    @Test
    void getCarPrice() {
        car = new AlloyWheelCarDecorator(car);
        System.out.println(car.getCarDetails() + " " + car.getCarPrice());

    }

    @Test
    void getCarDetails() {
        car = new AlloyWheelCarDecorator(new ColorCarDecorator(car, "Black"));
        System.out.println(car.getCarDetails() + " " + car.getCarPrice());

    }
}