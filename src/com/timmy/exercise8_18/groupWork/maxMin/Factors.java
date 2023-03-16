package com.timmy.exercise8_18.groupWork.maxMin;

public class Factors {
    public static void main(String[] args) {
       factorial(12);
    }
    private static void factorial(int number){
        int data = number;
        for (int i = 1; i < data; i++) {
            int mod = number % i;
            int result = number / i;
            if (mod == 0){
                if ((i==data) && (i != result)){
                    continue;
                }else {
                    data =result;
                    System.out.println(i + " , " + result);
                }
            }
        }
    }
}
