package by.minsk.epam.javaweb.radkevich.task1.task107;

import java.util.Scanner;

public class Task7 {
   // 7.	Даны две точки А(х1, у1) и В(х2, у2). Составить
   // алгоритм, определяющий, которая из точек находится ближе к началу координат. x y.

    public static void main(String[] agrs) {
        double ax = enterDouble("Enter the value of X at point A");
        double ay = enterDouble("Enter the value of Y at point A");
        double bx = enterDouble("Enter the value of X at point B");
        double by = enterDouble("Enter the value of Y at point B");


        double pointAdistanceСalculation =  Math.abs(Math.pow(ax,2)+Math.pow(ay,2));
        double pointBdistanceСalculation =  Math.abs(Math.pow(bx,2)+Math.pow(by,2));
        if (pointAdistanceСalculation>pointBdistanceСalculation) {
            System.out.println( "point A is closer to the origin xy");
        } else if (pointBdistanceСalculation>pointAdistanceСalculation) {
            System.out.println( "point B is closer to the origin xy");
        }
        else {
            System.out.println("point A and point B is equidistant from xy origin");}

    }

    public static double enterDouble(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);

        while (!scan.hasNextDouble()) {
            System.out.println(message);
            scan.next();
        }
        return scan.nextDouble();


    }
}