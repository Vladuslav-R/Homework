package by.minsk.epam.javaweb.radkevich.task1.task104;

import static by.minsk.epam.radkevich.utils.EnterValue.enterInt;

public class Runner {
    //4.Составить программу, печатающую значение true, если указанное высказывание является истинным,
    // и false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.
    public static void main(String[] args) {
        int a = enterInt("Enter A");
        int b = enterInt("Enter B");
        int c = enterInt("Enter C");
        int d = enterInt("Enter D");
        System.out.println(Logic.repeatingNumbers(a, b, c, d));
    }


}

