package by.minsk.epam.javaweb.radkevich.task1.task108;

import by.minsk.epam.radkevich.utils.EnterValue;

public class Logic {
   public static double functionValue (double x) {
       double result = 0;

       if (x >= 3) result = -Math.pow(x, 2) + 3 * x + 9;
       while (Math.pow(x, 3) == 6) {
           return result;

       }
       if (x < 3) result = 1 / (Math.pow(x, 3) - 6);
       return result;



   }
}
