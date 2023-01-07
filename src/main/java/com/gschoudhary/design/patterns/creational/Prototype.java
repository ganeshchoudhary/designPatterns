package com.gschoudhary.design.patterns.creational;

class BankAccount implements Cloneable{
    private String bankName;
    private String accountNumber;
    private String username;

    public BankAccount(String bankName, String accountNumber, String username) {
        this.bankName= bankName;
        this.accountNumber= accountNumber;
        this.username =username;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "bankName='" + bankName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

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
