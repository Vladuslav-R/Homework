import java.util.Scanner;

public class Task11 {
    public static void main(String[] agrs) {
        int a = enterInt("Введите день недели");


    }


    public static int enterInt(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);

        while (!scan.hasNextInt()) {
            System.out.println(message);
            scan.next();
        }
        return scan.nextInt();


    }



}