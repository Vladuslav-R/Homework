package by.minsk.epam.javaweb.radkevich.lesson1;

import java.util.Scanner;

public class Task3 {
    //3.	Окружность вписана в квадрат заданной площади. Найти площадь квадрата,
    // вписанного в эту окружность. Во сколько раз площадь вписанного квадрата меньше площади заданного?
    public static void main(String[] args) {
        double areaBigSquare = enterPositiveDouble("enter the area of the square");
        double sideBigSquare = Math.sqrt(areaBigSquare);
        double sideSmallSquare = sideBigSquare / Math.sqrt(2);
        double areaSmallSquare = sideSmallSquare * sideSmallSquare;
        double difference = areaBigSquare / areaSmallSquare;

        System.out.println(Math.sqrt(areaBigSquare));
        System.out.println(sideBigSquare);

        System.out.println(Math.round(difference * 100d) / 100d);

    }

    public static double enterPositiveDouble(String message) {
        double result = 0;
        System.out.println(message);
        while (result <= 0) {
            result = enterDouble(message);
            if (result <= 0)
                System.out.println("Enter value greater than 0");
        }
        return result;
    }

    public static double enterDouble(String message) {
        Scanner scan = new Scanner(System.in);
        double result;

        while (!scan.hasNextDouble()) {
            System.out.println(message);
            scan.next();
        }
        result = scan.nextDouble();

        return result;
    }
}
