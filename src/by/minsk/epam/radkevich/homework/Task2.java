package by.minsk.epam.radkevich.homework;


import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;


public class Task2 {
    public static void main(String[] args) {

        int[] array = new int[10];


        for (int i = 0; i < 10; ++i) {
            array[i] = ThreadLocalRandom.current().nextInt(-300, 300);
            System.out.print(array[i] + ",");


        }
        int min = 301;
        int indMin = 0;
        int max = -301;
        int indMax = 0;
        for (int j = 0; j < 10; ++j) {
            if (array[j] > max) {
                max = array[j];
                indMax = j;

            }
            if (array[j] < min) {
                min = array[j];
                indMin = j;

            }


        }
        System.out.println("\nиндекс минимального числа" + " " + indMin + " " + "minim " + min + " " + "\nиндекс максимального числа" + " " + indMax + " " + "максимум " + max);
        array[indMin] = max;
        array[indMax] = min;


        int i = 0;
        while (i < 10) {
            System.out.print(array[i] + ",");
            i++;
        }

    }

}