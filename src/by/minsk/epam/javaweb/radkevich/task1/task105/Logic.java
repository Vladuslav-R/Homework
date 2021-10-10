package by.minsk.epam.javaweb.radkevich.task1.task105;

public class Logic {
    public static boolean isPerfect(int number) {
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
            return true;
        }

        return false;
    }
}
