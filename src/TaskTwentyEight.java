import java.util.Scanner;

public class TaskTwentyEight {
    public static void main(String[] args) {
       String s = enterString("Введите текст");
       s = s.trim();
        char symbol;
        String commas;
        String spaces;

         int numberOfSpaces = 0;
        if(s.length() != 0) {
            numberOfSpaces++;
        }


        for (int j = 0; j < s.length(); j++) {
            symbol = s.charAt(j);
            if (symbol == ' ' && s.charAt(j-1) != ' ') {

                System.out.print(s.charAt(j-1));

            }
        }
        System.out.print(s.charAt(s.length()-1));







    }


    public static String enterString(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        return scan.nextLine();
    }
}
