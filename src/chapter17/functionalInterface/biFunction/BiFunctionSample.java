package chapter17.functionalInterface.biFunction;

import java.util.function.BiFunction;

public class BiFunctionSample {
    public static void main(String[] args) {
        BiFunction<String, String, String> biFunction =
                (firstNumber, secondNumber)-> firstNumber + " "+ secondNumber;
       String result  =biFunction.apply("1", "0");
        System.out.println(result);

//        BiFunction<String, String, Integer> biFunction =
//                (firstNumber, secondNumber)-> Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
//        Integer result  =biFunction.apply("1", "3");
//        System.out.println(result);
    }
}
