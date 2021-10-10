package by.minsk.epam.javaweb.radkevich.task1.task110;

import by.minsk.epam.radkevich.utils.EnterValue;

public class Task10 {

//10.	Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат представить
// в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие значения функции.

    public static void main(String[] args) {
        double a = EnterValue.enterDouble("Enter a");
        double b = EnterValue.enterDouble("Enter b");
        double h = EnterValue.enterDouble("Enter h");

        for (double d = a; d <= b; d = d + h) {
            System.out.println((d + "| " + Math.tan(d)));
        }


    }

}

