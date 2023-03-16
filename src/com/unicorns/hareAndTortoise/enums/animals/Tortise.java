package com.unicorns.hareAndTortoise.enums.animals;

import com.unicorns.hareAndTortoise.enums.AnimalMovement;

public class Tortise extends Animal {

    @Override
    public int move(AnimalMovement movement) {
        int newPosition =getPosition();
        if (movement.equals(AnimalMovement.FAST_PLOD)) {
             newPosition +=  3;
        } else if (movement.equals(AnimalMovement.SLIP)) {
            newPosition -= 6;
            newPosition = newPosition< 1 ? 1 : newPosition;
        }else if (movement.equals(AnimalMovement.SLOW_PLOD)) {
           newPosition+=1;
        }
        this.setPosition(newPosition);
        return this.getPosition();
    }
}
