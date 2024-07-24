package com.bytecoder.DesignPatterns.creational.abstractfactory;

import com.bytecoder.DesignPatterns.creational.abstractfactory.button.ButtonFactory;
import com.bytecoder.DesignPatterns.creational.abstractfactory.textbox.TextBox;
import com.bytecoder.DesignPatterns.creational.abstractfactory.textbox.TextBoxFactory;
import com.bytecoder.DesignPatterns.creational.abstractfactory.button.Button;

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
