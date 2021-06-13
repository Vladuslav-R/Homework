package by.minsk.epam.radkevich.homework;

public class TaskTwentyThree {
    public static void main(String[] agrs) {
        int[][] TwoDimensionalArray = {
                {1, 1, 1, 1, 1},
                {0, 1, 1, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 1}
        };


        for (int i = 0; i < TwoDimensionalArray.length; i++) {
            for (int j = 0; j < TwoDimensionalArray[i].length; j++) {

                System.out.print(TwoDimensionalArray[i][j] + " ");

            }
            System.out.println(" ");
        }


    }
}

