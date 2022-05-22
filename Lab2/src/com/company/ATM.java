package com.company;

public class ATM{

    public ATM() {}

    public void out(Account name) {
        System.out.print(String.valueOf(name.getBalance())+"\n");
        System.out.print(String.valueOf(name.getBalance())+"\n");
    }
    public void addM(Account name) {
        name.deposit(500.36);
    }
    public void takeM(Account name) {
        name.deposit(100.36);
    }
    public void det(Account name) {
        name.getDetails();
    }
}
