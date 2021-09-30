package by.minsk.epam.javaweb.radkevich.lesson1;

import by.minsk.epam.radkevich.EnterValue;

public class Task8 {
   // 8.	Вычислить значение функции:



    public static void main(String[] args) {
        double x = EnterValue.enterDouble("Enter X");
        double result = 0;

        if (x >= 3) result = -Math.pow(x, 2) + 3 * x + 9;
        while (Math.pow(x, 3) == 6) {
           EnterValue.enterDouble("Enter X");

        }
        if (x < 3) result = 1 / (Math.pow(x, 3) - 6);
        System.out.println(result);


    }

}
