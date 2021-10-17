package by.epam.minsk.javaweb.radkevich.task3;

import java.util.Arrays;

public class Logic {
    public static int[] selectionIntSort(int[] array) {
        int min, temp;
        for (int i = 0; i < array.length; i++) {
            min = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }

    public static void binarySearch(int[] array, int item) {
        Arrays.sort(array);
        int position;
        int counter = 0;
        int last = array.length - 1;
        int first = 0;



        position = (first + last) / 2;

        while ((array[position] != item) && (counter < array.length)) {
            System.out.println(counter);
            if (array[position] > item) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
            counter++;
        }
        if (first <= last) {
            System.out.println(item + " является " + ++position + " элементом в массиве");

            System.out.println("Элемент не найден в массиве. ");

        }
    }


}



