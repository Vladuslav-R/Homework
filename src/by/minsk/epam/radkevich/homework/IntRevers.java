package by.minsk.epam.radkevich.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class IntRevers {

    public static void main(String[] args) {


        int i = enterInt(scanInt2("Enter the data"));


        System.out.println(i);
    }

    public static int scanInt2(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        return scan.nextInt();
    }


    public static int enterInt(int i) {


        int result = 0;
        while (i > 0) {
            int r = i % 10;
            i = i / 10;
            result = result * 10 + r;

        }
        return result;
    }
}
