package com.company;
/**
 The <code> Account </code> class object simulates a bank account
 @author Buldakova
 @version 1.0
 */
public class Account {

    private int id;
    String customer; // фио
    private double balance = 0; // баланс
    private static long idCounter = 0; // id

    public Account() {}

    public Account(String c, double b) {
        this.id = Integer.parseInt(createID());
        this.customer = c;
        this.balance = b;
    }

    public static synchronized String createID(){
        return String.valueOf(idCounter++);
    }

    /**
     The <em> getBalance <em> method allows you to get the account balance
     @return double
     */
    public double getBalance() {
        return balance;
    }

    /**
     The <em> deposit <em> method allows you to replenish your account
     @param addmoney
     */

    public void deposit(double addmoney) {
        this.balance += addmoney;
        System.out.printf("Added: %s \tBalance: %s %s \n", addmoney, this.customer, this.balance);
    }

    /**
     The <em> withdraw <em> method ensures that money is withdrawn from the account
     */
    public void withdraw(double takecash) {
        this.balance -= takecash;
        System.out.printf("Cash: %s \tBalance: %s \n", takecash,this.balance);
    }

    public String getCustomer() {
        return customer;
    }

    public void getDetails() {
        System.out.printf("Id: %d \tCustomer: %s \tBalance: %.2f\n", this.id, this.customer, this.balance);
    }
}
