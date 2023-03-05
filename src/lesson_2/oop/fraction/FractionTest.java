package lesson_2.oop.fraction;

public class FractionTest {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 997);
        Fraction f2 = new Fraction(2, 202);

        Fraction result = f1.add(f2);
        System.out.println(result);
    }
}
