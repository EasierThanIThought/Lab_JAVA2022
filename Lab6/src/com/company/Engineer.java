package com.company;

public class Engineer extends Employee {
    public Engineer(String name, String surname, float salary) {
        super(name, surname, "Engineer", salary);
    }

    @Override
    protected void additionalFunction() {
        System.out.println("Information about Engineer");
    }
}
