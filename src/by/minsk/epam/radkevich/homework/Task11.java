package by.minsk.epam.radkevich.homework;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] agrs) {
        int a = enterInt("Введите порядковый номер дня недели");
         switch (a) {
             case 1:
                 System.out.println("Понедельник - курсы Java");
                 break;
             case 2:
                 System.out.println("Вторник - стоматолог");
                 break;
             case 3:
                 System.out.println("Среда - курсы Java среда");
                 break;
             case 4:
                 System.out.println("Четверг - кайфовать");
                 break;
             case 5:
                 System.out.println("Пятница - тренировка");
                 break;
             case 6:
                 System.out.println("Суббота - домашка");
                 break;
             case 7:
                 System.out.println("Воскресенье домашка+кайфовать");
                 break;
             default: System.out.println(a + "-й день недели? Ты серьезно?");
         }


    }


    public static int enterInt(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);

        while (!scan.hasNextInt()) {
            System.out.println(message);
            scan.next();
        }
        return scan.nextInt();


    }



}