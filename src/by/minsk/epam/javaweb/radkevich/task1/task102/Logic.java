package by.minsk.epam.javaweb.radkevich.task1.task102;

import by.minsk.epam.radkevich.utils.DateTime;

public class Logic {
    public static int getDaysNumber(int year, int month) {
        int[] daysInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (DateTime.isLeapYear(year) && month == 2) {
            return 29;
        } else {
            return daysInMonth[month - 1];
        }
    }
}
