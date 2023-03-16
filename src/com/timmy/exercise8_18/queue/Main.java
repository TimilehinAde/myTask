package com.timmy.exercise8_18.queue;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        int [] arr = {5, 2, 1, 8, 10};
//        Arrays.sort(arr);
//
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i] + ", ");
//        }
//        Integer [] arr = {5, 2, 1, 8, 10};
//        Arrays.sort(arr, Collections.reverseOrder());
//
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i] + ", ");

            Set s=new LinkedHashSet();
            s.add("1");
            s.add(1);
            s.add(3);
            s.add(2);
            System.out.println(s);

    }
}
