package ClassesCreation.Day_05_MutatorOrSetterMethods.Q3_FractionTester;

public class Fraction {
    // Create your instance variables and constructor here
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }


    public int getNumerator() {
        // IMPLEMENT THIS METHOD
        return numerator;
    }

    public int getDenominator() {
        // IMPLEMENT THIS METHOD
        return denominator;
    }

    public void setNumerator(int x) {
        // IMPLEMENT THIS METHOD
        numerator=x;
    }


    public void setDenominator(int x) {
        // IMPLEMENT THIS METHOD
        denominator=x;
    }

    public void add(Fraction other) {
        // IMPLEMENT THIS METHOD
        int commonDenominator=this.denominator*other.denominator;
        int newNumerator=this.numerator*other.denominator + other.numerator*this.denominator;
        this.numerator=newNumerator;
        this.denominator=commonDenominator;

    }

    public void subtract(Fraction other) {
        // IMPLEMENT THIS METHOD
        int commonDenominator = this.denominator * other.denominator;
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        this.numerator = newNumerator;
        this.denominator = commonDenominator;

    }

    public void multiply(Fraction other) {
        // IMPLEMENT THIS METHOD
        this.numerator *= other.numerator;
        this.denominator *= other.denominator;

    }

    public String toString() {
        // IMPLEMENT THIS METHOD
        return numerator + " / " + denominator;
    }

}
