package by.minsk.epam.radkevich;

import java.util.Scanner;

public class EnterValue {

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
        System.out.println(message);
        double result;

        while (!scan.hasNextDouble()) {
            System.out.println(message);
            scan.next();
        }
        result = scan.nextDouble();

        return result;
    }
}
