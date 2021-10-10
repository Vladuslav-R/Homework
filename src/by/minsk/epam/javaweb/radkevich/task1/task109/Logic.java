package by.minsk.epam.javaweb.radkevich.task1.task109;

public class Logic {


    public static double circumferenceOfACircle(double radius) {
        double circumference = 2 * radius * Math.PI;
        return (Math.round(circumference * 100d) / 100d);
    }

    public static double areaOfACircle(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        return (Math.round(area * 100d) / 100d);
    }

}
