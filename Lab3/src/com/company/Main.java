package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a1 = 0;
        float a2 = 0;
        float a3 = 0;
        System.out.print("Введите три стороны треугольника: ");
        if (scanner.hasNextFloat()){
            a1 = scanner.nextFloat();
            a2 = scanner.nextFloat();
            a3 = scanner.nextFloat();
        }
        float p = (a1 + a2 + a3) / 2;
        float s = (float)Math.sqrt(p * (p - a1) * (p - a2) * (p - a3));
        System.out.println("Площадь треугольника: " + s);
        System.out.printf("Площадь треугольника со сторонами " +
                "%.0f, %.0f, %.0f равна %.2f\n", a1, a2, a3, s);

        int Sround = Math.round(s);
        System.out.println("Округленная площадь равна " + Sround);
        char uniS = (char) Sround;
        char unia1 = (char) a1;

        System.out.printf("Округленное значение стороны %.0f в " +
                "таблице UNICODE соответствует %c\n", a1, unia1);
        System.out.printf("Округленное значение площади %d в " +
                "таблице UNICODE соответствует %c", Sround, uniS);
    }
}
