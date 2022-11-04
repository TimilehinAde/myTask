package chapter17.functionalInterface.Operator;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorSample {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = (number)-> number*number;
       Integer result= unaryOperator.apply(190);
        System.out.println(result);
//        Function<Integer, Integer> function = (num)-> num + num;
//        function.apply(9);
    }
}
