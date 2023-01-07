package com.gschoudhary.design.patterns.creational;


interface Bank{
    void printDetails();
}
class HDFCBank implements Bank{
    @Override
    public void printDetails() {
        System.out.println("Hdfc bank details");
    }
}

class IciciBank implements Bank{
    @Override
    public void printDetails() {
        System.out.println("Icici bank details");
    }
}


interface BankFactory{
    Bank getBank(String name);
}

class BankFactoryImpl implements BankFactory{
    @Override
    public Bank getBank(String name) {
        if(name.equals("HDFC")){
            return new HDFCBank();
        }
        if(name.equals("ICICI")){
            return new IciciBank();
        }
        return null;
    }
}

public class AbstractFactory {
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
