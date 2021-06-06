import java.util.Scanner;

public class TaskTwentySix {
    public static void main(String[] args) {
       String s = enterString("Введите текст");



        int numberOfCommas = 0;
        int numberOfPoints = 0;
        int positionIndexInTheString = 0;
        char symbol;
        String commas;
        String points;
        for (int i = 0; i < s.length(); i++) {
            symbol = s.charAt(i);
            if (symbol == ',') {
                numberOfCommas++;
            }
        }
        for (int j = 0; j < s.length(); j++) {
            symbol = s.charAt(j);
            if (symbol == '.') {
                numberOfPoints++;
            }
        }
        if (numberOfPoints % 10 == 1) {
            points = "точка";
        } else if (numberOfPoints % 10 == 2 || numberOfPoints % 10 == 3||numberOfPoints % 10 == 4) {
            points = "точки";
        } else {
            points = "точек";
        }

        if (numberOfCommas % 10 == 1) {
            commas = "запятая";
        } else if (numberOfCommas % 10 == 2 || numberOfCommas == 0) {
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

        System.out.println(numberOfCommas+ " "+ commas+ " " +numberOfPoints+ " "+points );


        }


    public static String enterString(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        return scan.nextLine();
    }
}
