package com.company;

public class Shirt {

    public int id = 1;
    public String description = "NewShirt";
    public char colorCode = 'R';
    public double price = 10.50;
    public int quantityInStock = 30;

    public void displayShirtInformation(){
        System.out.printf("Shirt Id: %d \nDescription: %s \nColorCode: %s \nprice: %.2f \n",
                id, description, colorCode, price, quantityInStock);
    }
}
