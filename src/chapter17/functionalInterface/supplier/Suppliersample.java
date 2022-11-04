package chapter17.functionalInterface.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Suppliersample {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Unicorns";
        System.out.println(supplier.get().toUpperCase());


//    Integer[] numbers = {2,3,4,5,6,7,8,8,9,10};
//        List<Integer> numberList = Arrays.asList(numbers);
//        numberList.stream()//2,3,4,5,6,7,8,8,9,10
//                .filter((number)->number%2==0)
//                .forEach((num)-> System.out.print(num + " "));
//    }
//    private static void printArrayElements(Integer[] numbers){
//        for (int i = 0; i < numbers.length ; i++) {
//            if (numbers[i]%2 ==0) System.out.print(numbers[i]);
//        }

    }
}
