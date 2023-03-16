package com.timmy.exercise8_18.socketProgramming;

public class Main {
    public static void main(String[] args) {
        String s = "aabbbcdde";
        System.out.println(duplicateChar(s));
    }

    public static int duplicateChar(String s){
        int sum;
        int total = s.length();
        char [] charArr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            charArr[i] = s.charAt(i);
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <s.length() ; j++) {
                if (charArr[i] == charArr[j]){
//                    charArr[j] = '0';
                    sum= total - 1;
                }
                else sum = total + 1;
            }
        }
//        for (int i = 0; i < s.length(); i++) {
//            if (charArr[i] != '0')sum+=1;
//        }
        System.out.println(charArr);
        return total;
    }
   // public static void main(String[] args) {
      //  int[] arr = {5, 1, 4, 2, 8,3, 4,9};
//        int n = arr.length;
//        for (int i = 0; i < arr.length - 1; i++) {
//            int min = i;
//            for (int j = i + 1; j < n; j++) {
//                if (arr[j] < arr[min]) {
//                    min = j;
//                }
//                System.out.print(j);
//            }
//            int temp = arr[min];
//            arr[min] = arr[i];
//            arr[i] = temp;
//            System.out.println(temp);
//        for(int i = 0; i < arr.length; i++){
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i] + arr[j] == 7){
//                    System.out.println(arr[i] + "," + arr[j]);
                }
  //          }
  //      }
  //  }

