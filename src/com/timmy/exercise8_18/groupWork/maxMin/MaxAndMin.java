package com.timmy.exercise8_18.groupWork.maxMin;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] array = {4, 3, 1, 9};
        int maxNumber = array[0];
        //int n = array.length;
        //int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < maxNumber) {
                maxNumber = array[i];
            }
//            int temp = array[maxNumber];
//           array[maxNumber] = array[i];
//            array[i] = temp;

        }
        System.out.println(maxNumber);
    }
}

