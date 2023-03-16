package com.timmy.exercise8_18.airCondition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionTest {

    @Test
    void testAirConditionIsCreated() {
        AirCondition lg = new AirCondition();
        Assertions.assertNotNull(lg);
    }

    @Test
    void testThatAirConditionCanBeOn() {
        AirCondition lg = new AirCondition();
        lg.turnOn();
        assertTrue(lg.isOn());
    }

    @Test
    void testThatAirConditionTemperatureCanIncrease() {
        AirCondition lg = new AirCondition();
        lg.increaseTemp();
        assertEquals(17, lg.getTemperature());
    }

    @Test
    void testThatAirConditionTemperatureCanDecrease() {
        AirCondition lg = new AirCondition();
        lg.DecreaseTemp();
        assertEquals(15, lg.getTemperature());
    }

    @Test
    void turnOn() {
    }

    @Test
    void getName() {
    }
}