package chapter8;

public class Complex {
    private float realPart;
    private float imaginaryPart;

    public Complex(float realPart, float imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    public Complex(){}

    public static void printComplexNumber(Complex firstComplex, Complex secondComplex){
        Complex complex = new Complex();
        complex.realPart = firstComplex.realPart + secondComplex.realPart;

        complex.imaginaryPart = firstComplex.imaginaryPart + secondComplex.imaginaryPart;
        System.out.printf("%.2f + %.2fi%n", complex.realPart, complex.imaginaryPart);
    }
    public static Complex addComplex(Complex firstComplex, Complex secondComplex) {
        Complex complex = new Complex();
        complex.realPart = firstComplex.realPart + secondComplex.realPart;
        complex.imaginaryPart = firstComplex.imaginaryPart + secondComplex.imaginaryPart;
        return complex;
    }

    public static Complex subtractComplexNumber(Complex firstComplex, Complex secondComplex) {
        Complex complex = new Complex();
        complex.realPart = firstComplex.realPart - secondComplex.realPart;
        complex.imaginaryPart = firstComplex.imaginaryPart - secondComplex.imaginaryPart;
        return complex;
    }

    @Override
    public String toString(){
        return "Complex{" +
                "realPart=" + realPart +
                ", imaginaryPart=" + imaginaryPart +
                '}';
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null|| getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return Float.compare(complex.realPart, realPart) == 0 && Float.compare(complex.imaginaryPart,imaginaryPart) ==0;
    }
}
