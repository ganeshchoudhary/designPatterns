package com.gschoudhary.design.patterns.creational;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class BankAccount implements Cloneable {
    private String bankName;

    private String accountNumber;

    private String username;

    @Override
    public BankAccount clone() throws CloneNotSupportedException {
        return (BankAccount) super.clone();
//        return new BankAccount(this.bankName, this.accountNumber, this.username);
    }
}
public class Prototype {
    //    Prototype design pattern is used when the Object creation is a costly affair and requires a lot of time and resources
//    and you have a similar object already existing. Prototype pattern provides a mechanism to copy the original object to
//    a new object and then modify it according to our needs.
    public static void main(String[] args) throws CloneNotSupportedException {
        BankAccount bankAccount = new BankAccount("test", "test", "test");
        System.out.println(bankAccount);
        bankAccount = bankAccount.clone();
        bankAccount.setBankName("clone");
        System.out.println(bankAccount);
    }
}
