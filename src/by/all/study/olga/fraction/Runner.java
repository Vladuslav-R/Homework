package by.all.study.olga.fraction;

public class Runner {
    public static void main (String [] args) {
        Fraction f1 = new Fraction(2,3);
        Fraction f2 = new Fraction(5,6);
        FractionLogik logik = new FractionLogik();
FractionView view = new FractionView();
Fraction rez;
rez =logik.additional(f1,f2); ;
   view.prinArOp(f1,f2,rez,'*');
//rez.reduction();
//        System.out.println(rez.getNumerator() + "/" + rez.getDenomenator());

    }

}
