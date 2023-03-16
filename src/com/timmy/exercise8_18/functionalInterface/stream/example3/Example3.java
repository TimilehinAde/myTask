package com.timmy.exercise8_18.functionalInterface.stream.example3;

import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,3,4,5,6);
        int result = numbers.stream()
                .filter((n)->n%2!=0)
                .mapToInt((n)->n*2)
                .sum();
        System.out.println(result);
    }
}
