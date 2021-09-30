package by.minsk.epam.javaweb.radkevich.lesson1;

import by.minsk.epam.radkevich.EnterValue;

import java.util.Scanner;

public class Task6 {
   // 6.	Идет n-я секунда суток, определить, сколько полных часов,
   // полных минут и секунд прошло к этому моменту.
    public static void main(String[] args) {
        int secondsInDay = 86400;
        int numberOfSecondsElapsed = 6327;
        int secondsLeft = secondsInDay - numberOfSecondsElapsed;

        int hour =  (secondsLeft/60/60);
        int minutes =  ((secondsLeft-hour*60*60)/60);
        int seconds = secondsLeft-(hour*60*60)-(minutes*60);

        System.out.println(hour + ":" + minutes + ":" + seconds);
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