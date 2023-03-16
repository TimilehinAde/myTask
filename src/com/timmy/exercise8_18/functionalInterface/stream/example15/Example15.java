package com.timmy.exercise8_18.functionalInterface.stream.example15;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example15 {
    public static void main(String[] args) {
        List<Integer> list = List.of(12,13,45,15,16,17);
        var result=list.stream()
                .peek(System.out::println)
                .collect(Collectors.toList());
      //  System.out.println(result);
        //skip
        List<String> words = List.of("AAA", "BBB", "BCCD", "HELLO");
        words.stream()
                .skip(2)
              .forEach(System.out::println);

        //sorted
        var sortedList = list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedList);

        var sortedInDescendingOrder =list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        //System.out.println(sortedInDescendingOrder);

        var res =list.stream()
                .filter((number)->number %2 ==0)
                .findAny()
                .orElse(-1);
        System.out.println(res);

        Optional<Integer> optionalMin = list.stream()
                .min(Comparator.naturalOrder());
        int minimum =optionalMin.orElse(-1);
        System.out.println(minimum);

        //reduce
        System.out.println(list.stream()
                .reduce((i, j) -> (i + j)).orElse(-1) / list.size());

        System.out.println(list.stream()
                .flatMapToInt(IntStream::of)//sum());
        .summaryStatistics());

        System.out.println(list.stream().count());


    }

}
