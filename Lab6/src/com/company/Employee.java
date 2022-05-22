package com.company;

public abstract class Employee {

    protected String name;
    protected String surname;
    protected String post;
    protected float salary;

    public Employee(String name, String surname, String post, float salary) {
        this.name = name;
        this.surname = surname;
        this.post = post;
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + name + " " + surname +
                "\nPosition: " + post +
                "\nSalary: " + salary;
    }

    protected abstract void additionalFunction();
}

