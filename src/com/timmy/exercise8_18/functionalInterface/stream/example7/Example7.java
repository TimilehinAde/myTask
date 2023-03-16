package com.timmy.exercise8_18.functionalInterface.stream.example7;

import java.util.List;

public class Example7 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,22,3,4,3,4,5,6,7);
        list.stream()
            .distinct()
            .sorted()

            .forEach(System.out::println);
    }
}
