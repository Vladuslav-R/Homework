package by.minsk.epam.javaweb.radkevich.task1.task101;

public class Logic {
    public static int getSquareLastDigit(int number) {
        int b = number % 10;
        int c = b * b;
        return c % 10;
    }
}
