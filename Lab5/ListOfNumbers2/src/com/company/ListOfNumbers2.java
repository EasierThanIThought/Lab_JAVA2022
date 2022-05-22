package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ListOfNumbers2 {

    private static ArrayList<Integer> arr;
    private static final int SIZE = 10;

    public ListOfNumbers2() {
        arr = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++)
            arr.add(new Integer(i));
    }


    public static void writeList() {
        PrintWriter out = null;

        try {
            out = new PrintWriter(new FileWriter("outfile.txt"));

            for (int i = 0; i < arr.size(); i++)
                out.println("Value at: " + i + " = " + arr.get(i));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " +
                    e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }

    public static void main(String[] args) {
        new ListOfNumbers2();
        ListOfNumbers2.readList();
        ListOfNumbers2.writeList();
        System.out.println("Program completed.");
    }

    public static void readList() {
        String numbersFromFile = "C:\\Учёба, Итмо, ITMO University\\3 год\\java\\Lab5\\" +
                "ListOfNumbers2\\out\\production\\ListOfNumbers2\\com\\company\\numbers.txt";
        try{
            Scanner scanner = new Scanner(new FileInputStream(numbersFromFile));
            while (scanner.hasNextInt()){
                int x = scanner.nextInt();
                System.out.println(x);
                arr.add(x);
            }
        }
        catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        finally {
            System.out.println("End of readList method");
        }
    }
}