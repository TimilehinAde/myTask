package chapter8;

public class Main {
    public static void main(String[] args) {
        Complex complex = new Complex(4, 5);
        Complex complexTwo = new Complex(4, 5);

        Complex.addComplex(complex, complexTwo);
        Complex.subtractComplexNumber(complex, complexTwo);
    }
}
