package com.gschoudhary.design.patterns.creational;

import com.gschoudhary.design.patterns.creational.abstractfactory.AbstractFactory;
import com.gschoudhary.design.patterns.creational.abstractfactory.AndroidAbstractFactory;
import com.gschoudhary.design.patterns.creational.abstractfactory.IOSAbstractFactory;
import com.gschoudhary.design.patterns.creational.abstractfactory.button.Button;
import com.gschoudhary.design.patterns.creational.abstractfactory.textbox.TextBox;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AbstractFactoryTest {
    AbstractFactory iosAbstractFactory;

    AbstractFactory androidAbstractFactory;

    @BeforeEach
    void setUp() {
        iosAbstractFactory = new IOSAbstractFactory();
        androidAbstractFactory = new AndroidAbstractFactory();
    }

    @Test
    void getButton() {
        Button button = androidAbstractFactory.getButton();
        Assertions.assertTrue(button.getButton().contains("android"));
    }

    @Test
    void getTextBox() {
        TextBox textBox = iosAbstractFactory.getTextBox();
        Assertions.assertTrue(textBox.getTextBox().contains("IOS"));
    }
}