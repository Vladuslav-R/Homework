
public class Task15 {
    public static void main(String[] agrs) {


        int count = 1;
        for (int i = 50; i < 70; i++) {
            int k = 0;

            for (int j = 2; j <= i; j++) {
                if ((i % j) == 0) {
                    k++;
                }

            }
            if (k < 2) {
                if (count == 2) {
                    System.out.println(i);
                    break;
                }
                count++;
            }
        }
    }
}
