package com.bytecoder.design.patterns.structural.decorator.example2;

public class ExtraVeggieBurgerDecorator extends BurgerWrapper {
    ExtraVeggieBurgerDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String getBurger() {
        return "With extra veggie " + burger.getBurger();
    }
}
