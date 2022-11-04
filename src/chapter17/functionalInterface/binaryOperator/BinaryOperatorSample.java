package chapter17.functionalInterface.binaryOperator;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;

public class BinaryOperatorSample {
    public static void main(String[] args) {
//        BinaryOperator<Integer> binaryOperator = (number, number2)-> (number * number2);
//            System.out.println(binaryOperator.apply(10, 5));
        DoubleBinaryOperator doubleBinaryOperator = (num1, num2)-> num1 + num2;
        double result = doubleBinaryOperator.applyAsDouble(59.89, 100.32);
        System.out.printf("the result is: %.2f%n" , result);
    }
}
