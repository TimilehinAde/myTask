package com.timmy.exercise8_18.functionalInterface.stream.example16;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example16 {
    public static void main(String[] args) {
        Stream<Integer> nums = Stream.of(1,23,45, 9,9,45,6,7,8);
//        Set<Integer> set = nums
//                //any number of intermediate ops
//                .collect(Collectors.toSet());
//        System.out.println(set);

        List<Integer> list =
                nums.collect(Collectors.toList());
        System.out.println(list);
        List<String> words = List.of("QWERTY", "YUIOU", "ASDFG^T", "ZXCVB", "OJRNRV");
//        Map<String, Integer> map = words.stream()
//                .collect(Collectors.toMap((str)->str, (str)->str.length()));
//        System.out.println(map);
//    }
//        Map<String, Integer> map = words.stream()
//                .collect(Collectors.toMap((str)->str, (str)->str.length(), (a,b)->a+b));
//        System.out.println(map);
        Map<String, Integer> map = words.stream()
                .collect(Collectors.toMap((str)->str, (str)->str.length(), (a,b)->a+b,
                        TreeMap::new));

        System.out.println(map);

    }
}
