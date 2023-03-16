package com.unicorns.hareAndTortoise;

import java.math.BigDecimal;
import java.security.SecureRandom;

public class RaceSimulator {
    public static int generateMoveNumber(){
        int moveNumber = 0;
        SecureRandom generator = new SecureRandom();
        moveNumber = BigDecimal.ONE.intValue() + generator.nextInt(5);
        return moveNumber;
    }
}
