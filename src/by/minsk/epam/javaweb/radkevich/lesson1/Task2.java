package by.minsk.epam.javaweb.radkevich.lesson1;


import java.util.Scanner;

public class Task2 {
    public static void main(String[] agrs) {
        // 2. Составить программу, которая по заданным году и номеру месяца определяет количество дней
        // в этом месяце и корректно определялись все високосные года.

        int[] daysInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month, year;

        year = enterBoundedInt("Enter year: ", 0, 4000);
        month = enterBoundedInt("Enter month: ", 1,12);

        if (isLeapYear(year) && month == 2) {
            System.out.println("29");
        } else {
            System.out.println(daysInMonth[month - 1]);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) return false;
        if (year % 100 == 0 && year % 400 != 0) return false;
        return true;
    }

    public static int enterBoundedInt(String message, int min, int max) {
        int result = enterInt(message);

        while (result < min || result > max)
            result = enterInt(message);

        return  result;
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
