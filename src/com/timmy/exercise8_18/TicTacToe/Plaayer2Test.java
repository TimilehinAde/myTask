package com.timmy.exercise8_18.TicTacToe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.timmy.exercise8_18.TicTacToe.Maark.*;
import static org.junit.jupiter.api.Assertions.*;

class Plaayer2Test {
    private Plaayer plaayer1;
    private Plaayer plaayer2;
    private Booard booard;
    private Maark [][] booardSurface;

    @BeforeEach
    void setUp(){
        plaayer1 = new Plaayer(X);
        plaayer2 = new Plaayer(O);
        booard = new Booard();
        booardSurface = booard.getSurface();
    }
    @Test
    void testThatBooardCellsAreEmpty(){
        var surface = booard.getSurface();
        assertEquals(E, surface[0][0]);
    }
    @Test
    void testThatPositionfourIsAreEmpty(){
        var surface = booard.getSurface();
        assertEquals(E, surface[1][0]);
        assertEquals(E, surface[1][2]);
        assertEquals(E, surface[1][2]);
        assertEquals(E, surface[1][1]);
    }
    @Test
    void testToDisplayBooardSurface(){
        booard.displayBooardSurface();
    }
    @Test
    void testThatXAppearsToPlaayer1Position(){
        plaayer1.playGame(1, booard);

        assertEquals(X, booardSurface[0][0]);

        plaayer1.playGame(2, booard);
        booardSurface = booard.getSurface();
        assertEquals(X, booardSurface[0][1]);

        plaayer1.playGame(3, booard);
        booardSurface = booard.getSurface();
        assertEquals(X, booardSurface[0][2]);

        booard.displayBooardSurface();
    }
    @Test
    void testThatXAppearsToPlaayer1PositionInRow1(){
        plaayer1.playGame(4, booard);
        Maark [][] booardSurface = booard.getSurface();
        assertEquals(X, booardSurface[1][0]);

        plaayer1.playGame(5, booard);
        booardSurface = booard.getSurface();
        assertEquals(X, booardSurface[1][1]);

        plaayer1.playGame(6, booard);
        booardSurface = booard.getSurface();
        assertEquals(X, booardSurface[1][2]);

        booard.displayBooardSurface();
    }
    @Test
    void testThatXAppearsToPlaayer1PositionInRow2() {
        plaayer1.playGame(7, booard);
        Maark[][] booardSurface = booard.getSurface();
        assertEquals(X, booardSurface[2][0]);

        plaayer1.playGame(8, booard);
        booardSurface = booard.getSurface();
        assertEquals(X, booardSurface[2][1]);

        plaayer1.playGame(9, booard);
        booardSurface = booard.getSurface();
        assertEquals(X, booardSurface[2][2]);

        booard.displayBooardSurface();
    }
    @Test
    void testThatXAppearsToPlaayer2Position(){
       plaayer2.playGame(1, booard);
        //Maark [][] booardSurface = booard.getSurface();
        assertEquals(O, booardSurface[0][0]);

        plaayer2.playGame(2, booard);
        booardSurface = booard.getSurface();
        assertEquals(O, booardSurface[0][1]);

        plaayer2.playGame(3, booard);
        booardSurface = booard.getSurface();
        assertEquals(O, booardSurface[0][2]);

        booard.displayBooardSurface();
    }
    @Test
    void testThatXAppearsToPlaayer2PositionInRow1(){
       plaayer2.playGame(4, booard);
       // Maark [][] booardSurface = booard.getSurface();
        assertEquals(O, booardSurface[1][0]);

        plaayer2.playGame(5, booard);
        booardSurface = booard.getSurface();
        assertEquals(O, booardSurface[1][1]);

        plaayer2.playGame(6, booard);
        booardSurface = booard.getSurface();
        assertEquals(O, booardSurface[1][2]);

        booard.displayBooardSurface();
    }
    @Test
    void testThatXAppearsToPlaayer2PositionInRow2() {
        plaayer2.playGame(7, booard);
       // Maark[][] booardSurface = booard.getSurface();
        assertEquals(O, booardSurface[2][0]);

        plaayer2.playGame(8, booard);
        booardSurface = booard.getSurface();
        assertEquals(O, booardSurface[2][1]);

        plaayer2.playGame(9, booard);

        assertEquals(O, booardSurface[2][2]);

        booard.displayBooardSurface();
    }
    @Test
    void testPlayer2Position(){
       // var booardSurface = booard.getSurface();
        for (int i = 1; i < 10; i++) {
            plaayer2.playGame(i, booard);
        }
        assertEquals(O, booardSurface[0][0]);
        assertEquals(O, booardSurface[0][1]);
        assertEquals(O, booardSurface[0][2]);
        assertEquals(O, booardSurface[1][0]);
        assertEquals(O, booardSurface[1][1]);
        assertEquals(O, booardSurface[1][2]);
        assertEquals(O, booardSurface[2][0]);
        assertEquals(O, booardSurface[2][1]);
        assertEquals(O, booardSurface[2][2]);

    }
    @Test
    void testThatAplayerCannotPlayInAnAlreadyPlayedPosition(){
        plaayer1.playGame(3, booard);
        assertThrows(RuntimeException.class, ()->plaayer2.playGame(3, booard));
        assertEquals(X, booardSurface[0][2]);
        booard.displayBooardSurface();
    }
    @Test
    void testThatAnExceptionIsThrownWhenAPlayersPlayOutOfBound(){

        assertThrows(ArrayIndexOutOfBoundsException.class, ()->plaayer1.playGame(10, booard));
        booard.displayBooardSurface();
        //plaayer2.playGame(10, booard);
    }
    @Test
    void testThatTrueIsReturnedIfAPlayerWinsAcrossRowZero(){
        for (int i = 1; i < 4; i++) {
            plaayer1.playGame(i, booard);
        }
        assertTrue(booard.isAWinner());
    }
    @Test
    void testThatTrueIsReturnedIfAPlayerWinsAcrossRowOne(){
        for (int i = 4; i < 7; i++) {
            plaayer1.playGame(i, booard);
        }
        assertTrue(booard.isAWinner());
    }
    @Test
    void testThatTrueIsReturnedIfAPlayerWinsAcrossRowTwo(){
        for (int i = 7; i < 10; i++) {
            plaayer1.playGame(i, booard);
        }
        assertTrue(booard.isAWinner());
    }
    @Test
    void testThatTrueIsReturnedIfAPlayerWinsThroughColumnOne(){
        for (int j = 1; j < 4; j++) {
            plaayer1.playGame(j, booard);
        }
        assertTrue(booard.isAWinner());
    }
    @Test
    void testThatTrueIsReturnedIfAPlayerWinsThroughColumnTwo(){
        for (int j = 4; j < 7; j++) {
            plaayer1.playGame(j, booard);
        }
        assertTrue(booard.isAWinner());
    }
    @Test
    void testThatTrueIsReturnedIfAPlayerWinsThroughColumnThree(){
        for (int j = 3; j < 10; j+=3) {
            plaayer1.playGame(j, booard);
        }

        assertTrue(booard.isAWinner());
    }
    @Test
    void testThatTrueIsReturnedIfAPlayerWinsLeftDiagonally(){
        plaayer1.playGame(1, booard);
       // assertEquals(X, booardSurface);
        plaayer1.playGame(5, booard);
        //assertEquals(X, booardSurface);
        plaayer1.playGame(9, booard);
        //assertEquals(X, booardSurface);

        assertTrue(booard.isAWinner());
    }
    @Test
    void testThatTrueIsReturnedIfAPlayerWinsRightDiagonally(){
        plaayer1.playGame(3, booard);
        // assertEquals(X, booardSurface);
        plaayer1.playGame(5, booard);
        //assertEquals(X, booardSurface);
        plaayer1.playGame(7, booard);
        //assertEquals(X, booardSurface);

        assertTrue(booard.isAWinner());
    }
    @Test
    void testThatIsATie(){
        plaayer1.playGame(1, booard);
        plaayer1.playGame(2, booard);
        plaayer2.playGame(3, booard);
        plaayer1.playGame(6,booard);
        plaayer2.playGame(4, booard);
        plaayer2.playGame(5, booard);
        plaayer1.playGame(7, booard);
        plaayer2.playGame(8, booard);
        plaayer1.playGame(9,booard);

        assertTrue(booard.isATie());
    }
}