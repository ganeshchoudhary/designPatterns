package com.gschoudhary.design.patterns.creational.factorymethod;

public class FactoryMethodMain {
//     an Abstract Factory “provides an interface for creating families of related or dependent objects without specifying their concrete classes”.
//     In other words, this model allows us to create objects that follow a general pattern.

    public static void main(String [] agrs){
        BankFactory bankFactory = new BankFactoryImpl();
        Bank bank = bankFactory.getBank("HDFC");
        bank.printDetails();
        bank = bankFactory.getBank("ICICI");
        bank.printDetails();
    }
}
