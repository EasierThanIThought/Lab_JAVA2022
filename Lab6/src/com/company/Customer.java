package com.company;

public class Customer {

    private String name;
    private String surname;
    private int id;
    private static long idCounter = 0;
    private float budget;
    private String mail;

    public Customer(String name, String surname, int budget, String mail) {
        this.name = name;
        this.surname = surname;
        this.id = Integer.parseInt(createID());
        this.budget = budget;
        this.mail = mail;
    }

    public static synchronized String createID(){
        return String.valueOf(idCounter++);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
