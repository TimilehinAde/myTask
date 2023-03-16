package com.unicorns.hareAndTortoise;

import com.unicorns.hareAndTortoise.enums.animals.Hare;
import com.unicorns.hareAndTortoise.enums.animals.Tortise;
import com.unicorns.hareAndTortoise.enums.AnimalMovement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class RaceSimulatorTest {
    private RaceCourse raceCourse;
    private Hare hare;
    private Tortise ijapa;
    @BeforeEach
    public void setUp(){
        raceCourse = new RaceCourse();
        hare = new Hare();
        ijapa = new Tortise();
    }
    @Test
    public void getRaceTrack(){
        assertNotNull(raceCourse.getRaceTrack());
    }
//    @Test
//    public void createRaceTrackWithSmallTrack(){
//        int[] smallTrack = new int[20];
//        raceCourse = new RaceCourse(smallTrack);
//        assertNotNull(raceCourse.getRaceTrack());
//        assertTrue(raceCourse.getRaceTrack().length>70);
//    }
    @Test
    public void createRaceTrackWithSmallTrack(){
        int[] smallTrack =new int[20];
        raceCourse = new RaceCourse(smallTrack);
        assertNotNull(raceCourse.getRaceTrack());
        assertTrue(raceCourse.getRaceTrack().length >70);
    }
    @Test
    public void checkAnimalAtStartPosition(){
        assertEquals(1, hare.getPosition());
        assertEquals(1,ijapa.getPosition());
    }
    @Test
    public void generateNumberGreaterThanZero(){
        int moveNumber = RaceSimulator.generateMoveNumber();
        assertTrue(moveNumber> BigDecimal.ZERO.intValue());
    }
    @Test
    public void generateNumberZero(){
        int moveNumber = RaceSimulator.generateMoveNumber();
        assertTrue(moveNumber > BigDecimal.ZERO.intValue());
        assertTrue(moveNumber < 11);
    }
    @Test
    public void ijapaFastPlod(){
        int ijapaPosition = ijapa.move(AnimalMovement.FAST_PLOD);
        assertEquals(4, ijapaPosition);
    }
    @Test
    public void ijapaSlip(){
        ijapa.setPosition(16);
        int ijapaPosition = ijapa.move(AnimalMovement.SLIP);
        assertEquals(10, ijapaPosition);
    }
    @Test
    public void tortoiseSlipFromLowPositionTest(){
        ijapa.setPosition(2);
        int ijapaPosition = ijapa.move(AnimalMovement.SLIP);
        assertEquals(1, ijapaPosition);
    }
    @Test
    public void ijapaSlowPlodTest(){
       int ijapaPosition = ijapa.move(AnimalMovement.SLOW_PLOD);
        assertEquals(2, ijapaPosition);
    }
}
