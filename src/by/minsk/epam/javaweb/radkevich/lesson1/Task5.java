package by.minsk.epam.javaweb.radkevich.lesson1;

import java.util.Scanner;

public class Task5 {
   // 5.	Составить программу, печатающую значение true, если указанное высказывание является истинным,
   // и false — в противном случае: является ли целое число совершенным (сумма делителей равна самому числу).
    public static void main(String[] args) {
        int b = enterInt("Введите число");

        for (int number = 1; number <= b; number++) {
            int sum = 0;
            int i = 1;

            while (i < number) {

                if (number % i == 0) {
                    sum += i;
                    i++;

                } else {
                    i++;

                }


            }

            if (sum == number) {
                System.out.println(number);

            }


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

