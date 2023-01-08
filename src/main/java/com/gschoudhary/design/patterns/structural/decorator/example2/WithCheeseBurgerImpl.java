package com.gschoudhary.design.patterns.structural.decorator.example2;

public class WithCheeseBurgerImpl extends BurgerWrapper {
    WithCheeseBurgerImpl(Burger burger) {
        super(burger);
    }

    @Override
    public String getBurger() {
        return " with cheese " + burger.getBurger();
    }
}
