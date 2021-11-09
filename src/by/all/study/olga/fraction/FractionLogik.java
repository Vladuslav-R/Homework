package by.all.study.olga.fraction;

public class FractionLogik {
    public Fraction additional (Fraction f1, Fraction f2) {
        int num = f1.getNumerator()* f2.getDenomenator()+ f2.getNumerator()*f1.getDenomenator() ;
        int den = f1.getDenomenator()*f2.getDenomenator();

        Fraction result = new Fraction(num,den);
        return result;


    }
}
