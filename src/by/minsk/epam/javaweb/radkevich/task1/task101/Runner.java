package by.minsk.epam.javaweb.radkevich.task1.task101;

import by.minsk.epam.radkevich.utils.EnterValue;

public class Runner {
    // 1.	Написать программу, позволяющую по последней цифре числа определить последнюю цифру его квадрата.
    public static void main(String[] args) {
        int a = EnterValue.enterInt("ENTER THE NUMBER ");
        System.out.println(Logic.getSquareLastDigit(a));
    }
}