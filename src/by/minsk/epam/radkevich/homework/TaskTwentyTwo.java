package by.minsk.epam.radkevich.homework;

public class TaskTwentyTwo {
    public static void main(String[] agrs) {
        int array[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        ArrayUtils.printArrayInline(array);

        System.out.println(" ");

        for (int i = 0; i < array.length / 2; i++) {
            int left = i;
            int right = array.length - i - 1;
            swop(left, right, array);
        }

        ArrayUtils.printArrayInline(array);
    }





    public static void swop(int a, int b, int array[]) {
        int temp;
        temp = array[a];
        array[a] = array[b];
        array[b] = temp;


    }

}
