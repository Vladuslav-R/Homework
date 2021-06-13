package by.minsk.epam.radkevich.homework;

import java.util.Scanner;

public class TaskTwentySeven {
    public static void main(String[] args) {
       String s = enterString("Введите текст");
        s = s.trim();
        char symbol;
        String commas;
        String spaces;

        int quantityOfSpaces = 0;
        if(s.length() != 0) {
            quantityOfSpaces++;
        }


        for (int j = 0; j < s.length(); j++) {
            symbol = s.charAt(j);
            if (symbol == ' '&&s.charAt(j-1) != ' ' ) {
                quantityOfSpaces++;
            }
        }
        if (s.charAt(0) == ' ') {
            quantityOfSpaces--;
        }
        if (s.charAt(s.length()-1) == ' ') {
            quantityOfSpaces--;
        }

        if (quantityOfSpaces == 1) {
            spaces = "слово";

        }else if (quantityOfSpaces % 10 == 1) {
            spaces = "слов";
        }  else if (quantityOfSpaces % 10 == 2 || quantityOfSpaces % 10 == 3||quantityOfSpaces % 10 == 4) {
            spaces = "слова";
        }else if(quantityOfSpaces>10||quantityOfSpaces<20) {
            spaces = "слов";
        } else {
            spaces = "слов";
        }






        System.out.println( quantityOfSpaces+ " "+spaces);


        }


    public static String enterString(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        return scan.nextLine();
    }
}
