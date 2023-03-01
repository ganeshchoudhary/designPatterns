package com.gschoudhary.design.patterns.structural.decorator.example2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BurgerImplTest {
    Burger burger = new BurgerImpl();

    @BeforeEach
    void setUp() {
    }

    @Test
    void getBurger() {
        System.out.println(burger.getBurger());
        System.out.println(new CheeseBurgerDecorator(burger).getBurger());
        System.out.println(new ExtraVeggieBurgerDecorator(new CheeseBurgerDecorator(burger)).getBurger());
    }
    @Test
    void getBurger2() {
        System.out.println(burger.getBurger());
        System.out.println(new ExtraVeggieBurgerDecorator(burger).getBurger());
    }
}