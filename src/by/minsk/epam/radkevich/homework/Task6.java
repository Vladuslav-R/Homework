package by.minsk.epam.radkevich.homework;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] agrs) {
        int a = enterInt("введите число ");


        if (a % 10 == 7) {
            System.out.println("Последняя цифра является 7");
        } else {
            System.out.println("Последняя цифра не является 7");
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
