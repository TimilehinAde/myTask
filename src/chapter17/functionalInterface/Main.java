package chapter17.functionalInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Instrument instrument = (i, numberOfInstrument) ->  System.out.println("playing a " + i + " "+ numberOfInstrument+"times");
        Instrument instrument1 = (v, numberOfInstrument) ->  System.out.println("playing a " + v + " "+ numberOfInstrument+"times");
        Map<Instrument, Integer> integerMap = new HashMap<>();
        integerMap.put(instrument, 4);
        integerMap.put(instrument1, 5);
        System.out.println(integerMap);
        instrument.play("Guitar", 4);
    }
//        Instrument instrument = (i,  numberOfInstuments) -> playImplementation(i) ;
//        System.out.println();
//        instrument.play("Guitar", 4);
////        System.out.println("static method invoked -> " + Instrument.nameOfFavoriteSong());
////        System.out.println(instrument.numberOfSongs());
//    }
//
//    private static void playImplementation(String instrument) {
//        System.out.println("Playing a " + instrument);
//        //System.out.println(Math.random());
//    }
//    public void play(String instrument, int numberOfInstrument){}
}
