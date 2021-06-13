package by.minsk.epam.radkevich.homework;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] agrs) {

        int e = enterInt("Введите длинну участка");
        int f = enterInt("введите ширину участка ");
        int a = enterInt("Введите длинну первого дома");
        int b = enterInt("Введите ширину первого дома");
        int c = enterInt("Введите длинну второго дома");
        int d = enterInt("Введите длинну второго дома");


        if (a + c <= e) {
            if (b + d <= f) {
                if (b + d <= e) {
                    if (a + c <= f) {
                        System.out.println("Дома помещаются на участке");
                    }
                }
            }
        } else {
            System.out.println("Дома не помещаются на участке");
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
