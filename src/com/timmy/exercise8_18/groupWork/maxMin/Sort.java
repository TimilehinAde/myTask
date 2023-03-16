package com.timmy.exercise8_18.groupWork.maxMin;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] array = {4, 3, 1, 9};
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
