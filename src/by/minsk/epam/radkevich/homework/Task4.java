package by.minsk.epam.radkevich.homework;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int a = enterint("Введите число 1");
        int b = enterint("Введите число 2");
        System.out.println((a + b) + a * b);

    }

    public static int enterint(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        while (!scan.hasNextInt()) {
            System.out.println(message);
            scan.next();
        }
        return scan.nextInt();
    }

}