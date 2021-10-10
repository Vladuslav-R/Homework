package by.minsk.epam.javaweb.radkevich.task1.task103;

public class Logic {


    public static double InscribedSquare(double areaBigSquare) {

        double sideBigSquare = Math.sqrt(areaBigSquare);
        double sideInscribedSquare = sideBigSquare / Math.sqrt(2);
        double areaInscribedSquare = Math.pow(sideInscribedSquare, 2);

        return (Math.round(areaInscribedSquare * 100d) / 100d);
    }


    public static double SquaerDifference(double areaBigSquare) {
        double areaInscribedSquare = InscribedSquare(areaBigSquare);
              double difference = areaBigSquare/areaInscribedSquare ;


        return (Math.round(difference * 100d) / 100d);
    }
}


