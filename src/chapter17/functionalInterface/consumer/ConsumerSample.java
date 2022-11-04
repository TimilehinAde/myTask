package chapter17.functionalInterface.consumer;

import chapter16.collections.Collection;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (i)-> System.out.println(i*2);
       // consumer.accept(60);

        List<Integer> numbers = List.of(1,2,3,4,5,6);
        numbers.forEach((number) -> System.out.println(number +2));
        System.out.println("Using consumer object directly below::");
        numbers.forEach(consumer);//un-modifiable

//        List<Integer> nums = new ArrayList<>();
//        nums.add(2);
//        nums.add(12);
//        System.out.println(nums);
//
//        List<Integer> unModLst
//                =Collections.unmodifiableList(nums);
//        unModLst.add(3);
//        System.out.println(unModLst);
    }
}
