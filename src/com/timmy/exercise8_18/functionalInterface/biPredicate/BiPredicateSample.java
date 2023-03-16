package com.timmy.exercise8_18.functionalInterface.biPredicate;

import java.util.function.BiPredicate;

public class BiPredicateSample {
    public static void main(String[] args) {
        BiPredicate<Integer, String> biPredicate =
                (number, word)-> word.length() == number;
        boolean result = biPredicate.test(5, "Hello ");
        System.out.println(result);
    }
}
