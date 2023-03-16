package com.unicorns.hareAndTortoise.enums.animals;

import com.unicorns.hareAndTortoise.enums.AnimalMovement;

import java.math.BigDecimal;

public abstract class Animal {
    private int position = BigDecimal.ONE.intValue();

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    public abstract int move(AnimalMovement movement);
}
