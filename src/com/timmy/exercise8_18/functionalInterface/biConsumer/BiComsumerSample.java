package com.timmy.exercise8_18.functionalInterface.biConsumer;

import java.util.Map;
import java.util.function.BiConsumer;

public class BiComsumerSample {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (name , age) -> System.out.println(name + "::"+ age);
        System.out.println("name----age");
        biConsumer.accept("Timi", 80);

        Map<String, Integer> mapOfPersons = Map.of(
                        "Banke", 38,
                        "Temi", 52,
                        "Hadiza", 150
        );
        mapOfPersons .forEach(biConsumer);
        mapOfPersons .forEach((name, age) -> System.out.println(name + " "+ age));
     }
}
