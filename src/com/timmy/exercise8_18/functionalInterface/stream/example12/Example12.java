package com.timmy.exercise8_18.functionalInterface.stream.example12;

import java.util.List;

public class Example12 {
    public static void main(String[] args) {
        List<String> list = List.of("Tom","Jerry","Bonny","Mickey","Donald");
        var name=list.stream()
                .findFirst()
                .orElse("-1");
        System.out.println(name);
    }
}
