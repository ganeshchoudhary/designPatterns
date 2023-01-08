package com.gschoudhary.design.patterns.structural.decorator.example2;

abstract class BurgerWrapper implements Burger {
    protected Burger burger;

    BurgerWrapper(Burger burger) {
        this.burger = burger;
    }
}
