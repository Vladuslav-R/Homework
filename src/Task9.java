import java.util.Scanner;

public class Task9 {

    public static void main(String[] agrs) {
        int day = enterInt("введите число ");
        int months = enterInt("порядковый номер месяца");
        String s = "некорректные данные";

        int year = enterInt("год");

        if (months == 1) {
            if (day > 1 || day <= 31) {
                System.out.println(day + ".01" + "." + year);
            }
            if (months == 2) {
                if (day > 1 || day <= 28) {
                    System.out.println(day + ".02" + "." + year);

                } else {
                    System.out.println(s);
                }

            }
        }
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
