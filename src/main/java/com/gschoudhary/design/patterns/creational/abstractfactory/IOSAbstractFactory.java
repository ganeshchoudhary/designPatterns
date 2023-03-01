package com.gschoudhary.design.patterns.creational.abstractfactory;

import com.gschoudhary.design.patterns.creational.abstractfactory.button.Button;
import com.gschoudhary.design.patterns.creational.abstractfactory.button.ButtonFactory;
import com.gschoudhary.design.patterns.creational.abstractfactory.textbox.TextBox;
import com.gschoudhary.design.patterns.creational.abstractfactory.textbox.TextBoxFactory;

public class IOSAbstractFactory implements AbstractFactory {

    private ButtonFactory buttonFactory;
    private TextBoxFactory textBoxFactory;

    public  IOSAbstractFactory(){
        this.buttonFactory = new ButtonFactory();
        this.textBoxFactory = new TextBoxFactory();
    }

    @Override
    public Button getButton(){
        return buttonFactory.getButton("IOS");
    }
    @Override
    public TextBox getTextBox(){
        return textBoxFactory.getTextBox("IOS");
    }
}
