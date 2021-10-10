package by.minsk.epam.javaweb.radkevich.task1.task105;

import static by.minsk.epam.javaweb.radkevich.task1.task105.Logic.isPerfect;
import static by.minsk.epam.radkevich.utils.EnterValue.enterInt;

public class Task5 {
    // 5.	Составить программу, печатающую значение true, если указанное высказывание является истинным,
    // и false — в противном случае: является ли целое число совершенным (сумма делителей равна самому числу).
    public static void main(String[] args) {
        int b = enterInt("Введите число");
        System.out.println(isPerfect(b));
    }
}