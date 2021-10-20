package by.utils;

public class ArrayUtils {

    public static void printArrayInline(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.println(element + " ");
        }
    }
}