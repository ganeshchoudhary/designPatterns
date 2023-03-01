package com.gschoudhary.design.patterns.creational.abstractfactory;

import com.gschoudhary.design.patterns.creational.abstractfactory.button.Button;
import com.gschoudhary.design.patterns.creational.abstractfactory.textbox.TextBox;

public interface AbstractFactory {
     Button getButton();

     TextBox getTextBox();
}
