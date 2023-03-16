package com.timmy.exercise8_18.functionalInterface.stream.example2;

import java.util.List;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,9);//(9,2)
        var result= numbers.stream()
                                    .map((n)-> n*2)
                                    .reduce(0,(i,j)->i+j);//1,
        System.out.println(result);
    }
//    private static Stream<Integer> getIntStream(){
//        return Stream.empty();//rather than anti-pattern
//    }
}
