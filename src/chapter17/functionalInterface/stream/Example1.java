package chapter17.functionalInterface.stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;
//How to obtain streams in java
public class Example1 {
    public static void main(String[] args) {
        //1. using the empty factory method from the stream
        //interface
        Stream<Integer> numberStream = Stream.empty();//finite stream

        //2. using the stream utility method of class Arrays
        Integer[] numbers = {2,3,4,5,6,7,8,9};
        Stream<Integer> integerStream = Arrays.stream(numbers);//finite stream

        //3. using the method generate of class stream
       // Stream<Integer> nums = Stream.generate(()->5);//infinite stream
        Stream<Integer> nums = Stream.generate(()->new Random().nextInt());//infinite stream
        nums.limit(5)//intermediate operation known as limit
        .forEach((n)-> System.out.println(n));
    }
}
