package by.all.study.olga.fraction;

public class Fraction {
    private int numerator;
    private int denomenator;


    public int getDenomenator() {
        return denomenator;
    }

    public void setDenomenator() {
        this.denomenator = denomenator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator() {
        this.numerator = numerator;
    }

    public Fraction(int _numerator, int _denomenator) {
        numerator = _numerator;
        if (_denomenator == 0) {
            throw new RuntimeException("denomenator can't be null");
        }
        denomenator = _denomenator;

    }

    public void reduction() {
        int nod = this.nod();
        numerator = numerator / nod();
        denomenator = denomenator / nod();


    }

    private int nod() {
        int x = numerator;
        int y = denomenator;
        while (x != 0 && y != 0) {
            if (x > y) {
                x = x % y;
            } else {
                y = y % x;
            }
        }
        return x + y;
    }
}





