package com.timmy.exercise8_18.functionalInterface.stream.example6;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example6 {
    public static void main(String[] args) {
        List<List<String>> list = List.of(
                List.of("Mavericks", "Rockets"),
                List.of("Unicorns", "Luminaries"),
                List.of("Mavens", "Technophiles")
        );
        Function<List<String>, Stream <String>> function = (l)->l.stream();
        var lst =list.stream()
                .flatMap(function)
                .collect(Collectors.toList());
        System.out.println(lst);
    }
}
