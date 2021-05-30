public class TaskTwentyOne {

    public static void main(String[] agrs) {
        int array[] = {60, 20, 30, 40, 50,200, 70, 80, 90,10};
        int i;
        int j;
        int maxValue = array[0];
        int minValue = array[0];
        int maxValuInd = 0;
        int minValueInd = 0;
        int sum = 0;

        for (i = 0; i <= array.length-1; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxValuInd = i;
            }
        }
        for (j = 0; j <= array.length-1; j++) {
            if (array[j] < minValue) {
                minValue = array[j];
                minValueInd = j;
            }
        }
        int swop = maxValuInd-minValueInd;
        if (swop<0) {
            int temp = minValueInd;
            minValueInd=maxValuInd;
            maxValuInd = temp;}




        for (int k = minValueInd; k <= maxValuInd; k++) {
            sum=sum+array[k];

        }
        System.out.println(sum);


    }
}