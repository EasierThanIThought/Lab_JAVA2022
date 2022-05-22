package com.company;

public class Secretary extends Employee {
    public Secretary(String name, String surname, float salary) {
        super(name, surname, "Secretary", salary);
    }

    @Override
    protected void additionalFunction() {
        System.out.println("Information about Secretary");
    }
}
