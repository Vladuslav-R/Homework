public class TaskTwentyOne {

    public static void main(String[] agrs) {
        int array[] = {10, 20, 30, 40, 50, 100, 70, 80, 90, 60};
        int i;
        int j;
        int maxValue = array[0];
        int minValue =  array[0];

        for (i; i>array.length;i++){
            if (array[i] > maxValue) {
                maxValue = array[i];
            }

            for (j; j >array.length;j++){
                if (array[j] < minValue) {
                    minValue = array[j];
                }
                System.out.println("min=" + minValue + "max=" + maxValue);
            }
        }
    }
}