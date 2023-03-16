package com.timmy.exercise8_18.functionalInterface.stream.example8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Example8 {
    public static void main(String[] args) {
        List<Woman> women =
                List.of(
                        new Woman("Banke", 60 ),
                        new Woman("Jennifer", 109),
                        new Woman("titi", 40),
                        new Woman("Hadiza",200));
        List<Woman> sortedWomen = women.stream()
                .sorted()
                .sorted(Comparator.comparing(Woman::getName))
                .collect(Collectors.toList());
        System.out.println(sortedWomen);
        Map<String, Integer> map = new TreeMap<>();

        women.stream()
                .map((woman)-> map.put(woman.getName(), woman.getAge()))
                .forEach((age)->System.out.print(" "));
                //.collect(Collectors.toList());
        System.out.println(map);
    }
}
