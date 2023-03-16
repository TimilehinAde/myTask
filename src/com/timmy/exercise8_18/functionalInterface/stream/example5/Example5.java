package com.timmy.exercise8_18.functionalInterface.stream.example5;

import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class Example5 {
    public static void main(String[] args) {
        Stream<Integer> nums = Stream.of(1,2,3,4,5,6);
        Function<Integer, Integer> function = (num)->num * num;
        nums.map(function) //[1,4,9,16,25,36]
                .forEach(System.out::println);
    }
}
