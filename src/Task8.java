import java.util.Scanner;

public class Task8 {


    public static void main(String[] agrs) {
        int a = enterInt("введите число ");
        int b = a % 10;
        String rubl = "рублей";
        if (b == 1) {
            rubl =  " рубль";
        } else if (10 < a && a < 21) {
            rubl = "рублей";
        } else if (1 < b && b < 5) {
            rubl =  " рубля");
        } 
        System.out.println(a + " " + rubl);

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


