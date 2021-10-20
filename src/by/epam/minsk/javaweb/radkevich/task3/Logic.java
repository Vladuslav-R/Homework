package by.epam.minsk.javaweb.radkevich.task3;

import by.utils.EnterValue;

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
        selectionIntSort(array);
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

    public static int arrayMinValue(int[] array) {

        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[min] > array[i]) {
                array[min] = array[i];
            }
        }
        return array[min];
    }

    public static int arrayMaxValue(int[] array) {

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[max] < array[i]) {
                array[max] = array[i];
            }
        }
        return array[max];
    }

    public static void simpleValue(int[] array) {
        int[] simpleValue = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            if (array[i] > 1 && array[i] % 2 == 0 && array[i] % 3 != 0) {

                simpleValue[i] = array[i];
                System.out.println(simpleValue[i]);
            }
        }
    }


    public static int[] findFibonacciNumbers(int[] array) {


        int[] fibonacciArray = new int[array.length];
        int length = 0;

        for (int number : array) {
            if (isFibonacci(number))
                fibonacciArray[length++] = number;
        }
        int[] result = new int[length];
        System.arraycopy(fibonacciArray, 0, result, 0, length);

        return result;
    }


    public static boolean isFibonacci(int number) {
        int temp = 5 * number * number;
        return (Math.sqrt(temp + 4) % 1 == 0 || Math.sqrt(temp - 4) % 1 == 0) && number >= 0;
    }


    public static int[] printUnique(int[] array) {
        int[] number = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (isUnique(array[i]) == true) {
                number[i] = array[i];
            }
        }
        return number;
    }

    public static boolean isUnique(int number) {
        int tmp1, tmp2, tmp3;
        tmp1 = number / 100;
        tmp2 = (number % 100) / 10;
        tmp3 = (number % 10);
        return tmp1 != tmp2 && tmp1 != tmp3 && tmp2 != tmp3;
    }

    public static int[] (int [] array);
    array.length=;

    Integer[] temp = new Integer[arrayLength];
        for(
    int i = 0;
    i<arrayLength;i++)

    {
        temp[i] = array[i];
    }
}