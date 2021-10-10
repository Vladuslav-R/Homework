package by.minsk.epam.javaweb.radkevich.task1.task105;

import java.util.Scanner;

import static by.minsk.epam.radkevich.utils.EnterValue.enterInt;

public class Task5 {
    // 5.	Составить программу, печатающую значение true, если указанное высказывание является истинным,
    // и false — в противном случае: является ли целое число совершенным (сумма делителей равна самому числу).
    public static void main(String[] args) {
        int b = enterInt("Введите число");
        System.out.println(isPerfect(b));
    }


    public static boolean isPerfect(int b) {
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



        return false;
    }
}