
public class Task15 {
    public static void main(String[] agrs) {


        int count = 1;
        for (int i = 50; i < 70; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.println(i);
                if (count == 2) {
                    System.out.println("i" + i);
                    break;
                }
                count++;
            }
        }
}
