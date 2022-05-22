package com.company;

public class Director extends Employee {
    public Director(String name, String surname, float salary) {
        super(name, surname, "Director", salary);
    }

    @Override
    protected void additionalFunction() {
        System.out.println("Information about Director");
    }
}
