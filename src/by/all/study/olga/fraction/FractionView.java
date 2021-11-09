package by.all.study.olga.fraction;

public class FractionView {
    public void prinArOp(Fraction f1, Fraction f2, Fraction rez, char op) {
       String str;
        printFractionInLine(f1);
        System.out.print(op);
        printFractionInLine(f2);
        System.out.print('=');
        printFractionInLine(rez);



//        printFractionInLine(f1);
//        System.out.print(op);
//        printFractionInLine(f2);
//        System.out.print('=');
//        printFractionInLine(rez);

    }

    public void printFractionInLine(Fraction f) {
        System.out.print(f.getNumerator() + "/" + f.getDenomenator());

    }
}
