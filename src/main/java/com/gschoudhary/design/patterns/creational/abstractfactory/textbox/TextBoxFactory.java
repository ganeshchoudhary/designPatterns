package com.gschoudhary.design.patterns.creational.abstractfactory.textbox;

public class TextBoxFactory {
    public TextBox getTextBox(String boxType) {
        TextBox textBox = null;
        if(boxType.equals("Android")){
            textBox = new AndroidTextBox();
        }
        if(boxType.equals("IOS")){

            textBox = new IOSTextBox();
        }
        return textBox;
    }
}
