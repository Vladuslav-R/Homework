package by.minsk.epam.javaweb.radkevich.lesson1;

import java.util.Scanner;

public class Task4 {
    //4.Составить программу, печатающую значение true, если указанное высказывание является истинным,
    // и false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.
    public static void main(String[] args) {
        int a = enterInt("Enter A");
        int b = enterInt("Enter B");
        int c = enterInt("Enter C");
        int d = enterInt("Enter D");
        int counter = 0;
        if (a % 10 == 0) {
            counter++;
        }
        if (b % 10 == 0) {
            counter++;
        }
        if (c % 10 == 0) {
            counter++;
        }
        if (d % 10 == 0) {
            counter++;
        }
        System.out.println(counter);

        if (counter <= 2) {
            System.out.println("true");
        } else {
            System.out.println("false");
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