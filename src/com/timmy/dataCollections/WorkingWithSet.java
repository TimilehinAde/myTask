package com.timmy.dataCollections;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithSet {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));
        balls.forEach(System.out::println);

    }
    static class Ball{
        String color;


        public Ball(String red) {
        }
    }
//    record Ball(String color){}
}
