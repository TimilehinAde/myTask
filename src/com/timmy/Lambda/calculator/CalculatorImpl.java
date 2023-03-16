package com.timmy.Lambda.calculator;

import com.timmy.Lambda.calculator.Calculator;

public class CalculatorImpl  {

//    @Override
//    public void switchOn() {
//        System.out.println("switch on");
//
        //  (parameter)   ->  {body}
    public static void main(String[] args) {
//        Calculator calculator = () ->   System.out.println("switch on");
//              calculator.switchOn();
//        Calculator calculator =(input) ->   System.out.println("Sum : "+input);
//        calculator.sum(234);
        Calculator calculator=(i1, i2) -> {

            if (i2 < i1) {
                throw new RuntimeException("message");
            } else {
                return i2 - i1;
            }
        };
        System.out.println(calculator.subtract(28, 20));
    }


}
