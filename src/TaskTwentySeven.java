import java.util.Scanner;

public class TaskTwentySeven {
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
            if (symbol == ' '&&s.charAt(j-1) != ' ' ) {
                numberOfSpaces++;
            }
        }
        if (s.charAt(0) == ' ') {
            numberOfSpaces--;
        }
        if (s.charAt(s.length()-1) == ' ') {
            numberOfSpaces--;
        }

        if (numberOfSpaces == 1) {
            spaces = "слово";

        }else if (numberOfSpaces % 10 == 1) {
            spaces = "слов";
        }  else if (numberOfSpaces % 10 == 2 || numberOfSpaces % 10 == 3||numberOfSpaces % 10 == 4) {
            spaces = "слова";
        }else if(numberOfSpaces>10||numberOfSpaces<20) {
            spaces = "слов";
        } else {
            spaces = "слов";
        }






        System.out.println( numberOfSpaces+ " "+spaces);


        }


    public static String enterString(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        return scan.nextLine();
    }
}
