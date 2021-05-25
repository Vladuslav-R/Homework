import java.util.Scanner;

public class Task9 {

    public static void main(String[] agrs) {

        int[] daysInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int day, month, year;
        day = enterInt("Введите день: ");
        //todo: 1-31
        month = enterInt("Введите месяц: ");
        //todo: 1-12
        year = enterInt("Введите год: ");

        if ((day == daysInMonth[month - 1] && !(isLeapYear(year) && month == 2)) || (month == 2 && day == 29 && isLeapYear(year))) {
            day = 1;
            if (month == 12) {
                month = 1;
                year++;
            } else {
                month++;
            }
        } else {
            day++;
        }
        System.out.println("Следующая дата: " + (day < 10 ? ("0" + day) : day) + "." + (month < 10 ? ("0" + month) : month) + "." + year);
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) return false;
        if (year % 100 == 0 && year % 400 != 0) return false;
        return true;
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


