package com.gschoudhary.design.patterns.structural.decorator;
// can be implemented with classes or methods with decoration
// enum or object decorated -> for decoration
// order decoration (custom ordered item-> add on items -> tips -> instruction -> gift )  or car decoration -> custom car-> extra add benefits -> tips -> ...
public class Main {
    public static void main(String[] args) throws Exception {
//        Car car = new CarImplementation("Vanue");
//        System.out.println(car.getCarDetails() + " " + car.getCarPrice());
//        car = new WithAlloyWheel(car);
//        System.out.println(car.getCarDetails() + " " + car.getCarPrice());
//        car = new WithCustomMatColor(car, "Black");
//        System.out.println(car.getCarDetails() + " " + car.getCarPrice());
//
//        car = new CarImplementation("creta");
//        System.out.println(car.getCarDetails() + " " + car.getCarPrice());
//        car = new WithAlloyWheel(car);
//        System.out.println(car.getCarDetails() + " " + car.getCarPrice());
//        car = new WithCustomMatColor(car, "Black");
//        System.out.println(car.getCarDetails() + " " + car.getCarPrice());

        Car c = new CarImplementation("test");
        System.out.println(new CarDecoratorImpl(c).addAlloyWheel().addColor("color").getCarDetails());
    }
}
