package by.minsk.epam.javaweb.radkevich.task1.task102;

import by.minsk.epam.radkevich.utils.EnterValue;

public class Runner {
    public static void main(String[] agrs) {
        // 2. Составить программу, которая по заданным году и номеру месяца определяет количество дней
        // в этом месяце и корректно определялись все високосные года.

        int month, year;

        year = EnterValue.enterBoundedInt("Enter year: ", 0, 4000);
        month = EnterValue.enterBoundedInt("Enter month: ", 1, 12);

        System.out.println(Logic.getDaysNumber(year, month));
    }
}
