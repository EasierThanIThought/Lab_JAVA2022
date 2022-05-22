package com.company;

import java.util.List;

public class Deal {
    private Customer customer;
    private Customer seller;
    private List<Product> products;
    private int id;
    private static long idCounter = 1;
    private String date;
    private float price;

    public Deal(Customer customer, Customer seller, String date, List<Product> products, float price) {
        this.customer = customer;
        this.seller = seller;
        this.products = products;
        this.id = Integer.parseInt(createID());
        this.date = date;
        this.price = price;
    }
    public static synchronized String createID(){
        return String.valueOf(idCounter++);
    }

    public String toString() {
        return "Information deal №" + id + " date " + date + "\n" +
                "Seller: " + seller.getName() + " " + seller.getSurname() + "\n" +
                "Buyer: " + customer.getName() + " " + customer.getSurname() + "\n" +
                "Price: " + price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getSeller() {
        return seller;
    }

    public void setSeller(Customer seller) {
        this.seller = seller;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


    public int getNumber() {
        return id;
    }

    public void setNumber(int number) {
        this.id = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}
