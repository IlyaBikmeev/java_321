package lesson_2.oop.fraction;

//Immutable class
public class Fraction {
    private final long numerator;      //числитель дроби
    private final long denominator;    //знаменатель дроби

    public Fraction(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    private Fraction reduce() {
        long newNumerator = numerator;
        long newDenominator = denominator;
        for(int i = 2; i <= Math.min(numerator, denominator); ++i) {
            while(newNumerator % i == 0 && newDenominator % i == 0) {
                newNumerator /= i;
                newDenominator /= i;
            }
        }
        return new Fraction(newNumerator, newDenominator);
    }


    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    //Прибавить к текущей дроби другую и выдать ответ в виде новой дроби
    public Fraction add(Fraction other) {
        return new Fraction(
                this.numerator * other.denominator + other.numerator * this.denominator,
                this.denominator * other.denominator
        ).reduce();
    }

    //Вычитание дробей
    public Fraction substract(Fraction other) {
        return new Fraction(
                this.numerator * other.denominator - other.numerator * this.denominator,
                this.denominator * other.denominator
        ).reduce();
    }

    //Умножение дробей
    public Fraction multiply(Fraction other) {
        return new Fraction(
                this.numerator * other.numerator,
                this.denominator * other.denominator
        ).reduce();
    }

    //Деление дробей
    public Fraction divide(Fraction other) {
        return new Fraction(
                this.numerator * other.denominator,
                this.denominator * other.numerator
        ).reduce();
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
