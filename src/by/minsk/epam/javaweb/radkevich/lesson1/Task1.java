package by.minsk.epam.javaweb.radkevich.lesson1;

import java.util.Scanner;

public class Task1 {
   // 1.	Написать программу, позволяющую по последней цифре числа определить последнюю цифру его квадрата.
    public static void main(String[] args) {
        int a = enterInt("ENTER THE NUMBER");
        int b = a % 10;
        int c = b * b;
        int d = c % 10;
        System.out.println(d);
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