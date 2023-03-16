package com.timmy.dataCollections;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> colorsUnmodify=List.of(
                "blue",
                "pink",
                "black"

        );

        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("pink");
        colors.add("yellow");
        colors.add("grey");
        System.out.println(colors.size());
        System.out.println(colors.contains("grey"));
        System.out.println(colors.contains("black"));
        System.out.println(colors);

//        for (String color : colors){
//            System.out.println(color);
//        }
//        colors.forEach(System.out::println);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
