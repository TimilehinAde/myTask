package com.timmy.exercise8_18.functionalInterface.stream.example4;

import java.util.List;

public class Example4 {
    public static void main(String[] args) {
    List<Integer> numbers = List.of(2,3,4,5);
    numbers.stream()
            .mapToInt((n)->n+1)
            .mapToObj((n)->n)
            .forEach((n)-> System.out.println(n));
    }
}
