package by.minsk.epam.javaweb.radkevich.task1.task109;

import by.minsk.epam.radkevich.utils.EnterValue;


public class Task9 {
    // 9.	Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
    public static void main(String[] args) {
        double radius = EnterValue.enterPositiveDouble("Enter radius");

        System.out.println("with a radius " + radius + " the area of the circle is equal " + Logic.areaOfACircle(radius) + " and the circumference " + Logic.circumferenceOfACircle(radius));

    }
}