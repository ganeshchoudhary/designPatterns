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
        System.out.println(new WithCheeseBurgerImpl(burger).getBurger());
        System.out.println(new WithVeggieImpl(new WithCheeseBurgerImpl(burger)).getBurger());
    }
    @Test
    void getBurger2() {
        System.out.println(burger.getBurger());
        System.out.println(new WithVeggieImpl(burger).getBurger());
    }
}