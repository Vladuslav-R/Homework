package by.minsk.epam.radkevich.homework;

import java.util.Scanner;

public class Task8 {


    public static void main(String[] agrs) {
        int a = enterInt("введите число ");
        int b = a % 10;
        if (a % 10 == 1) {
            System.out.println(a + " рубль");
        } else if (10 < a && a < 21) {
            System.out.println(a + " рублей");
        } else if (1 < b && b < 5) {
            System.out.println(a + " рубля");
        } else {
            System.out.println(a + " " + "рублей");
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


