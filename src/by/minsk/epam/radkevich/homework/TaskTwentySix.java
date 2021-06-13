package by.minsk.epam.radkevich.homework;

import java.util.Scanner;

public class TaskTwentySix {
    public static void main(String[] args) {
       String s = enterString("Введите текст");



        int quantityOfCommas = 0;
        int quantityOfPoints = 0;
        int positionIndexInTheString = 0;
        char symbol;
        String commas;
        String points;
        for (int i = 0; i < s.length(); i++) {
            symbol = s.charAt(i);
            if (symbol == ',') {
                quantityOfCommas++;
            }
        }
        for (int j = 0; j < s.length(); j++) {
            symbol = s.charAt(j);
            if (symbol == '.') {
                quantityOfPoints++;
            }
        }
        if (quantityOfPoints % 10 == 1) {
            points = "точка";
        } else if (quantityOfPoints % 10 == 2 || quantityOfPoints % 10 == 3||quantityOfPoints % 10 == 4) {
            points = "точки";
        } else {
            points = "точек";
        }

        if (quantityOfCommas % 10 == 1) {
            commas = "запятая";
        } else if (quantityOfCommas % 10 == 2 || quantityOfCommas == 0) {
            commas = "запятых";
        } else {
            commas = "запятые";
        }

            // пытался сделать двумя разными способами, почему второй выдает -1 , так и не понял
       /* while (positionIndexInTheString != -1) {
            s.indexOf('.', positionIndexInTheString);
            if (positionIndexInTheString != -1){
                positionIndexInTheString++;
                numberOfPoints++;
            }

        }*/

        System.out.println(quantityOfCommas+ " "+ commas+ " " +quantityOfPoints+ " "+points );


        }


    public static String enterString(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        return scan.nextLine();
    }
}
