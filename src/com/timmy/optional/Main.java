package com.timmy.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> empty = Optional.ofNullable("hello");
        System.out.println(empty.isEmpty());
        System.out.println(empty.isPresent());

        String orElse = empty.orElse("world");
        System.out.println(orElse);
    }
}
