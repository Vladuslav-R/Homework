package by.epam.minsk.javaweb.radkevich.task3;

import by.utils.EnterValue;

public class Runner {
    public static void main(String[] args) {
        int[] array = {532, 382, 246, 678, 704, 373, 709, 156, 120};
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();

        Logic.selectionIntSort(array);

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }

        System.out.println();

        Logic.binarySearch(array, EnterValue.enterInt(" Введите число"));
    }


}
