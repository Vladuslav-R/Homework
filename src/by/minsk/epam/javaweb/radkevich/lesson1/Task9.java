package by.minsk.epam.javaweb.radkevich.lesson1;

import java.util.Scanner;

public class Task9 {
   // 9.	Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
    public static void main(String[] args) {
        double radius = enterPositiveDouble("Enter radius");
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * radius * Math.PI;
        System.out.println("with a radius " + radius + " the area of the circle is equal " + area + " and the circumference " + circumference);


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