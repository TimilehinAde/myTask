package com.timmy.exercise8_18.functionalInterface.stream.example15;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Exercise {
    public static void main(String[] args) {
        //List of Strings that contins string that all
        //alphanumeric. Count all the digits in the strings
        //contained in the list
        String[] sequence = {"QWERTY#$26354", "Gfdfdf757", "cbcvvjf2335"};
        int resuelt = countDigitsInStrings(Arrays.asList(sequence));
        //System.out.println(resuelt);
        List<String> words = List.of("QWERTY#$26354", "Gfdfdf757", "cbcvvjf2335");

        var numberOfDigit= theSolution(words);
        System.out.println(numberOfDigit);
    }

    private static long theSolution(List<String> words) {
        return words.stream()
                .reduce("", (i, j) -> i + j)
                .chars().filter(Character::isDigit).count();
    }
    private static long countingDigits(List<String> words){
        String digits = "0123456789";
       return words.stream()
                .flatMap((s)->Arrays.stream(s.split("")))
                .filter(digits::contains)
                .count();

    }

    private static int countDigitsInStrings(List<String> list){
        int counter = 0;
        for (String str:list){
            for (int i = 0; i <str.length() ; i++) {
                if (Character.isDigit(str.charAt(i))) counter++;
            }
        }return counter;
    }
}
