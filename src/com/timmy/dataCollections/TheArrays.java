package com.timmy.dataCollections;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0]= "red";
        colors[1] = "green";
        colors[3] = "violet";

        System.out.println(colors[2]);
        System.out.println(colors[1]);
        System.out.println(colors[0]);
        System.out.println(colors[4]);


        colors[2] = "brown";
        System.out.println(Arrays.toString(colors));

        int[] numbers = new int[2];
        numbers[0] = 100;
        numbers[1] = 200;
        for (int i = 0; i < colors.length ; i++) {
            System.out.println(colors[i]);
        }

    }
}

