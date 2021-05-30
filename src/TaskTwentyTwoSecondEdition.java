public class TaskTwentyTwoSecondEdition {
    public static void main(String[] agrs) {
        int array[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        ArrayUtils.printArrayInline(array);

        System.out.println(" ");

        for (
                int i = 0;
                i < array.length; i = i + 2) {
            if (i == array.length - 1) break;
            int left = i;
            int right = i + 1;
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
