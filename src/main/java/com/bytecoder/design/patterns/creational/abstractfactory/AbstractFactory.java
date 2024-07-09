package com.bytecoder.design.patterns.creational.abstractfactory;

import com.bytecoder.design.patterns.creational.abstractfactory.button.Button;
import com.bytecoder.design.patterns.creational.abstractfactory.textbox.TextBox;

public interface AbstractFactory {
     Button getButton();

     TextBox getTextBox();
}
