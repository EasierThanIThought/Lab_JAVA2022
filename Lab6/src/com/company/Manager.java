package com.company;

public class Manager extends Employee {
    public Manager(String name, String surname, float salary) {
        super(name, surname, "Manager", salary);
    }

    @Override
    protected void additionalFunction() {
        System.out.println("Information about Manager");
    }
}
