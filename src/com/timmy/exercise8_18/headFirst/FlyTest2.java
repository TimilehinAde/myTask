package com.timmy.exercise8_18.headFirst;

public class FlyTest2 {
    public static void main(String[] args) {
//        Airplane biplane = new Airplane();
//        biplane.speed = 212;
//        System.out.println(biplane.speed);
        Jet jet1 = new Jet();
        jet1.speed = 212;
        System.out.println(jet1.speed);

        Jet jet2 = new Jet();
        jet2.setSpeed(212);
        System.out.println(jet2.getSpeed());
    }
}
