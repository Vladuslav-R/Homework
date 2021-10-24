package by.epam.minsk.radkevich.javaweb.task3;

import by.utils.EnterValue;

import java.util.concurrent.ThreadLocalRandom;

public class Logic {

    public static int[] inputArray(int length) {

        length = EnterValue.enterIntWithoutString();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = EnterValue.enterIntWithoutString();
        }

        return array;
    }

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

            if (array[position] > item) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
            counter++;
        }
        if (first <= last) {
            System.out.println(item + " is " + ++position + " an element in the array");
        } else {
            System.out.println("The element was not found in the array. ");

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

        for (int i=0;i>array.length;i++) {
            if (isFibonacci(array[i]))
                fibonacciArray[length++] = array[i];
        }
        int[] result = new int[length];
//        System.arraycopy(fibonacciArray, 0, result, 0, length);

        return result;
    }


    public static boolean isFibonacci(int number) {
        int temp = 5 * number * number;
        return (Math.sqrt(temp + 4) % 1 == 0 || Math.sqrt(temp - 4) % 1 == 0) && number >= 0;
    }


    public static int[] unique(int[] array) {
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

    public static int[] insertionSort(int[] array) {

        for (int left = 0; left < array.length; left++) {
            int value = array[left];

            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        return array;

    }

    public static int[] bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;

                }
            }

        }
        return array;

    }

    public static int[] enterArray() {
        int size = EnterValue.enterInt("enter the number array elements");
        int array[] = new int[size];
        System.out.println("Insert array elements:");
        for (
                int i = 0; i < size; i++) {
            array[i] = EnterValue.enterIntWithoutString();
        }
        return array;
    }


    public static int[] generateArray() {
        int size = ThreadLocalRandom.current().nextInt(1, 20);
        int array[] = new int[size];

        for (
                int i = 0; i < size; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(100, 999);
        }

        return array;
    }

}
