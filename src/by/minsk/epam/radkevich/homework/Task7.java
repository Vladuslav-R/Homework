package by.minsk.epam.radkevich.homework;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] agrs) {
        int a = enterInt("введите число А");
        int b = enterInt("введите число B");
        int r = enterInt("введите радиус круга");
        double c = Math.sqrt(a * a + b * b) / 2; // радиус прямоугольника
        if (r >= c) {
            System.out.println("круг закроет прямоугольник");
        } else {
            System.out.println("круг не закроет прямоугольник");
        }
    }


    public static int enterInt(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);

        while (!scan.hasNextInt()) {
            System.out.println(message);
            scan.next();
        }
        return scan.nextInt();


    }

}