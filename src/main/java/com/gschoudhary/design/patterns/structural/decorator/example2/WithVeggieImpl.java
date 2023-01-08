package com.gschoudhary.design.patterns.structural.decorator.example2;

public class WithVeggieImpl extends BurgerWrapper {
    WithVeggieImpl(Burger burger) {
        super(burger);
    }

    @Override
    public String getBurger() {
        return "With extra veggie " + burger.getBurger();
    }
}
