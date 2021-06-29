package by.minsk.epam.radkevich.homework;

import java.util.Scanner;

public class Revers {
    public static void main(String[] args) {
        String a = enterString(enterValue("Enter the data"));

    }


    public static String enterString(String message) {
        StringBuffer buffer = new StringBuffer(message);
        buffer.reverse();
        System.out.println(buffer);
        return message;


    }

    public static String enterValue(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);

        return scan.next();
    }


}
