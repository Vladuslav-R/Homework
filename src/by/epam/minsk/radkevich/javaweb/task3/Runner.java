package by.epam.minsk.radkevich.javaweb.task3;

import by.utils.ArrayUtils;
import by.utils.EnterValue;

public class Runner {
    public static void main(String[] args) {
        int[] array = {522, 382, 246, 678, 704, 373, 709, 156, 120};

        System.out.println("If you want to enter an array from the console, enter 1");
        System.out.println("If you want to generate an array, enter 2");
        System.out.println("If you want to continue working with the created array, enter 3");
        Array array1 = new Array();



        int x = EnterValue.enterIntWithoutString();
        switch (x) {
            case (1):
                array1.setArray(Logic.enterArray());
                ArrayUtils.printArrayInline(array1.getArray());

                break;
            case (2):
                array1.setArray(Logic.generateArray());
                ArrayUtils.printArrayInline(array1.getArray());

                break;
            case (3):

                array1.setArray(array);
                ArrayUtils.printArrayInline(array1.getArray());

                break;

            default:
                System.out.println("К такому жизнь меня не готовила");
                break;
        }
        System.out.println("If you want to do Selection sort, enter 1");
        System.out.println("If you want to do Insertion Sort, enter 2");
        System.out.println("If you want to do Bubble Sort, enter 3");
        System.out.println("If you want to find elemen find the item using Binary Search, enter 4");
        System.out.println("If you want to find elemen find Simple Number, enter 5");
        System.out.println("If you want to find elemen find Maximum Value, enter 6");
        System.out.println("If you want to find elemen find Minimum Value, enter 7");
        System.out.println("If you want to find  Fibonacci Numbers, enter 8");
        System.out.println("If you want to find  Unique Numbers, enter 9");


        int y = EnterValue.enterIntWithoutString();
        switch (y) {

            case (1):
                Logic.selectionIntSort(array1.getArray());
                ArrayUtils.printArrayInline(array1.getArray());

                break;
            case (2):
                Logic.insertionSort(array1.getArray());
                ArrayUtils.printArrayInline(array1.getArray());

                break;
            case (3):
                Logic.bubbleSort(array1.getArray());
                ArrayUtils.printArrayInline(array1.getArray());

                break;
            case (4):

                Logic.binarySearch(array1.getArray(),EnterValue.enterIntWithoutString());


             break;

            case (5):
                Logic.simpleValue(array1.getArray());
                ArrayUtils.printArrayInline(array1.getArray());

                break;
            case (6):
                System.out.println(Logic.arrayMaxValue(array1.getArray()));

                break;
            case (7):
                System.out.println(Logic.arrayMinValue(array1.getArray()));

                break;
            case (8):


                ArrayUtils.printArrayInline(Logic.findFibonacciNumbers(array1.getArray());

                break;
            case (9):
                Logic.unique(array1.getArray());
                ArrayUtils.printArrayInline(array1.getArray());
                break;
            default:
                System.out.println("Life didn't prepare me for this");
                break;
        }

    }
}










