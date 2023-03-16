package com.timmy.exercise8_18.functionalInterface.stream.example11;

import java.util.stream.Stream;

public class Exercise11 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.skip(6)
                .filter(n->n>5)
                .forEach(System.out::println);
    }
}
