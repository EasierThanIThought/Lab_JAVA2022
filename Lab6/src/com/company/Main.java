package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // первое задание

       /* Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Число " + a + " в двоичной системе: " + Integer.toBinaryString(a));
        // число 10 в двоичной 1010
        // сдвиг позиций в соответсвии с единицими числа
        a = (a << 3) + (a << 1);
        System.out.println("Ответ: " + a);
        System.out.println("Число " + a + " в двоичной системе: " + Integer.toBinaryString(a));

    // второе задание
    Date date = new Date();
    date.setDay(15);
    date.setMonth(4);
    date.setYear(2022);

    System.out.println("Specified month: " + date.displayMonth(date.getMonth()));


        // третье задание
        List<Product> products = new ArrayList<Product>();
        Customer customer1 = new Customer("Alisa", "Pogodaeva", 100, "alisa@mail.ru");
        Customer customer2 = new Customer("Ekaterina", "Buldakova", 100000, "kate@gmail.com");
        Product product1 = new Product("Crabs", 1, 4, "Best crabs ever", true);
        Product product2 = new Product("Pierniki", 2, 5, "Hand made", true);
        Product product3 = new Product("Martini", 3, 36, "Bianko", true);
        Product product4 = new Product("Babka", 4, 17, "Only during Easter holidays", false);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        Scanner in = new Scanner(System.in);
        List<Deal> deals = new ArrayList<>();
        while (true) {
            System.out.println("Choose the option: ");
            System.out.println("1 - Print all deals list");
            System.out.println("2 - New deal");
            int a = in.nextInt();
            switch (a) {
                case 1: {
                    System.out.println(deals);
                    break;
                }
                case 2: {
                    System.out.println("Who is the seller?");
                    System.out.println("1 - Alisa");
                    System.out.println("2 - Ekaterina");
                    int name = in.nextInt();
                    if (name == 1) {
                        List<Product> sellerlist = new ArrayList<>();
                        float money = 0;
                        System.out.println("What to sell? (-1 for exit)");
                        for (int i = 0; i < products.size(); i++) {
                            System.out.print(i + ": " );
                            products.get(i).displayInfo();
                        }
                        while (true) {
                            int id = in.nextInt();
                            if (id == -1) {
                                break;
                            }
                            if (id > 0 || id < products.size()) {
                                sellerlist.add(products.get(id));
                                money += products.get(id).getPrice();
                            }
                        }
                        if (customer2.getBudget() < money) {
                            System.out.println("Customer has no money!");
                            break;
                        }
                        Date date = new Date();
                        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                        System.out.println(formatter.format(date));
                        customer1.setBudget(customer1.getBudget() - money);
                        customer2.setBudget(customer2.getBudget() + money);
                        Deal deal = new Deal(customer2, customer1, formatter.format(date), sellerlist, money);
                        deals.add(deal);

                    }
                    else {
                        System.out.println("Wrong input");
                    }
                    break;
                }
                default: {
                    System.out.println("Wrong input");
                    break;
                }
            }
        }*/
    Employee[] emps = {
            new Director("Martin", "Eden", 120000),
            new Manager("Jason", "Statham", 90000),
            new Engineer("Charles", "Dickens", 110000),
            new Secretary("Winston", "Churchill", 80000),
    };
    showInfo(emps);
    }

    public static void showInfo(Employee[] emps) {
        for (Employee e : emps) {
            e.additionalFunction();
            System.out.println(e);
            System.out.println("---------------------------------------");
        }
    }
}

