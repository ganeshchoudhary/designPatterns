package com.gschoudhary.design.patterns.structural.decorator.example2;

public class CheeseBurgerDecorator extends BurgerWrapper {
    CheeseBurgerDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String getBurger() {
        return " with cheese " + burger.getBurger();
    }
}
