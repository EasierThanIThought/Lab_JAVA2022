package com.company;

public class Product {
    public Product(String name, int id, float price, String description, Boolean isExist) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.description = description;
        this.isExist = isExist;
    }

    private String name;
    private int id;
    private float price;
    private String description;
    private Boolean isExist;

    public void displayInfo(){
        System.out.println("Product: " + name + " for " + price + " coins");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getExist() {
        return isExist;
    }

    public void setExist(Boolean exist) {
        isExist = exist;
    }


}
