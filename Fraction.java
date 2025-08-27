public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        }   

    public Int divideNumbers(int numerator, int denominator) {
        return numerator/denominator;
    }

    public void flip() {
        int denominator = this.numerator;
        this.numerator = this.denominator;
        this.denominator = denominator;
    }

    }
