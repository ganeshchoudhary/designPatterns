package com.bytecoder.design.patterns.structural.decorator.example2;

public class CheeseBurgerDecorator extends BurgerWrapper {
    public CheeseBurgerDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String getBurger() {
        return " with cheese " + burger.getBurger();
    }
}
