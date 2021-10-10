package by.minsk.epam.javaweb.radkevich.task1.task103;

import by.minsk.epam.radkevich.utils.EnterValue;

import java.util.Scanner;

public class Runner {
    //3.	Окружность вписана в квадрат заданной площади. Найти площадь квадрата,
    // вписанного в эту окружность. Во сколько раз площадь вписанного квадрата меньше площади заданного?
    public static void main(String[] args) {
        double areaBigSquare = EnterValue.enterPositiveDouble("enter the area of the square");

        System.out.println("The area of the inscribed square is " + Logic.InscribedSquare(areaBigSquare));
        System.out.println("The area of an inscribed square is "  + Logic.SquaerDifference(areaBigSquare) + " times less than the area of a given square ");


    }
}
