package by.minsk.epam.javaweb.radkevich.task1.task104;

public class Logic {

    public static boolean repeatingNumbers(int a, int b, int c, int d) {
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


        if (counter >= 2) {
            return true;
        } else {
            return false;
        }

    }
}
