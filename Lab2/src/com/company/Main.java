package com.company;
public class Main {
    public static void main(String[] args) {
/*       int randomNum;
        int guess;
        if (args.length == 0 || args[0].equals("help"))
        { System.out.println("Enter a value from 1 to 5"); }
        else
        {
            randomNum = (int) (Math.random() * 5 + 1);
            try
            { guess = Integer.parseInt(args[0]); }
            catch (NumberFormatException e)
            { guess = 0; }
            if (guess < 1 || guess > 5)
            {
                System.out.println("Invalid argument");
            }
            else if (guess == randomNum)
            {
                System.out.println("Congratulations!");
            }
            else
            {
                System.out.println("Sorry; try again...");
            }
        }*/
/*
        Account account = new Account(); // создание объекта

        ATM atm = new ATM(); // создание объекта
        Account Jerry = new Account("Jerry H", 500);
        // изменяем имя и возраст
        Account Tom = new Account("Tom C", 200);
        System.out.printf("Balance: %s \n", Jerry.getBalance());

        atm.out(Tom);
        atm.addM(Tom);
        atm.takeM(Tom);
        atm.out(Tom);
        atm.det(Tom);
        atm.det(Jerry);}*/
        Shirt shirt = new Shirt();
        shirt.displayShirtInformation();
    }
}

