package com.timmy.exercise8_18.groupWork;

import java.util.Arrays;

public class HugeInteger {
    private int[] numbers = new int[40];
    String digits ="123456789123456789123456789123456789123456789123456789";

    public static boolean greaterThan(HugeInteger hugeInteger1, HugeInteger hugeInteger2) {
        int count =0;
        int hugeInteger1Sum = 0;
       int hugeInteger2Sum = 0;
       while (count < 40) {
            hugeInteger1Sum+=hugeInteger1.numbers[count];
            hugeInteger2Sum+=hugeInteger2.numbers[count];
            count++;
        }
       if (hugeInteger1Sum > hugeInteger2Sum) return true;
       return false;
    }

    public static boolean lessThan(HugeInteger hugeInteger1, HugeInteger hugeInteger2) {
        int count =0;
        int hugeInteger1Sum = 0;
        int hugeInteger2Sum = 0;
        while (count < 40) {
            hugeInteger1Sum+=hugeInteger1.numbers[count];
            hugeInteger2Sum+=hugeInteger2.numbers[count];
            count++;
        }
        if (hugeInteger1Sum < hugeInteger2Sum) return true;
        return false;
    }

    public static boolean isEqual(HugeInteger hugeInteger1, HugeInteger hugeInteger2) {

            int count =0;
            int hugeInteger1Sum = 0;
            int hugeInteger2Sum = 0;
            while (count < 40) {
                hugeInteger1Sum+=hugeInteger1.numbers[count];
                hugeInteger2Sum+=hugeInteger2.numbers[count];
                count++;
            }
            if (hugeInteger1Sum == hugeInteger2Sum) return true;
            return false;

    }

    public static boolean isNotEqual(HugeInteger hugeInteger1, HugeInteger hugeInteger2) {
        int count =0;
        int hugeInteger1Sum = 0;
        int hugeInteger2Sum = 0;
        while (count < 40) {
            hugeInteger1Sum+=hugeInteger1.numbers[count];
            hugeInteger2Sum+=hugeInteger2.numbers[count];
            count++;
        }
        if (hugeInteger1Sum != hugeInteger2Sum) return true;
        return false;
    }

    public static boolean isGreaterThanOrEqualTo(HugeInteger hugeInteger1, HugeInteger hugeInteger2) {
        int count =0;
        int hugeInteger1Sum = 0;
        int hugeInteger2Sum = 0;
        while (count < 40) {
            hugeInteger1Sum+=hugeInteger1.numbers[count];
            hugeInteger2Sum+=hugeInteger2.numbers[count];
            count++;
        }
        if (hugeInteger1Sum >= hugeInteger2Sum) return true;
        return false;
    }

    public static boolean islessThanOrEqualTo(HugeInteger hugeInteger1, HugeInteger hugeInteger2) {
        int count =0;
        int hugeInteger1Sum = 0;
        int hugeInteger2Sum = 0;
        while (count < 40) {
            hugeInteger1Sum+=hugeInteger1.numbers[count];
            hugeInteger2Sum+=hugeInteger2.numbers[count];
            count++;
        }
        if (hugeInteger1Sum <= hugeInteger2Sum) return true;
        return false;
    }

    public static boolean isZero(HugeInteger hugeInteger) {
        int count =0;
        int hugeIntegerSum = 0;
        while (count < 40) {
            hugeIntegerSum+=hugeInteger.numbers[count];
            count++;
        }
        if (hugeIntegerSum ==0) return true;
        return false;

    }

    public void parse(String digits) {
        for (int i = 0; i < digits.length(); i++) {
            //char digit = digits.charAt(i);
            if (Character.isLetter(i)) containsLetter();
            if (digits.length() > 40) exceedLenght();
            else StringToInteger(digits, i);
        }

    }

    private void StringToInteger(String digits, int i) {
        StringToInt(digits, i);
    }

    private void StringToInt(String digits, int i) {
        char character = digits.charAt(i);
        for (int j = 0; j < digits.length() ; j++) {
            int digitsToInt = Integer.parseInt(String.valueOf(character));
            numbers[i] = digitsToInt;
        }
    }

    private void exceedLenght() {
        throw new DigitLenghtException("you've exceeded the lenght");
    }

    private void containsLetter() {
        throw new NumberFormatException("only digit is allow");
    }

    @Override
    public String toString() {
        return "HugeInteger{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }
    public int[] getNumbers() {
        return numbers;
    }

    public static HugeInteger addHugeInteger(HugeInteger hugeInteger1, HugeInteger hugeInteger2){
        int count =0;
        HugeInteger hugeInteger = new HugeInteger();
        while (count<40){
            hugeInteger.numbers[count] = hugeInteger1.numbers[count] + hugeInteger2.numbers[count];
            count++;
        }
        return hugeInteger;
    }
    public static HugeInteger subtractHugeInteger(HugeInteger hugeInteger1, HugeInteger hugeInteger2){
        int count =0;
        HugeInteger hugeInteger = new HugeInteger();
        while (count<40){
            hugeInteger.numbers[count] = hugeInteger1.numbers[count] - hugeInteger2.numbers[count];
            count++;
        }
        return hugeInteger;
    }

}
