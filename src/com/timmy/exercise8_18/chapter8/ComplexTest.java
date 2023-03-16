package com.timmy.exercise8_18.chapter8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {
    private Complex firstComplex;
    private Complex secondComplex;

    @BeforeEach
    void setUp(){
        firstComplex = new Complex(4,8);
        secondComplex = new Complex(3,5);
    }
    @Test
    void testThatComplexNumberCanBeAdded(){
        Complex addNumber = Complex.addComplex(firstComplex, secondComplex);
        assertEquals(new Complex(7,13), addNumber);
    }
    @Test
    void testThatComplexNumberCanBeSubtracted(){
        Complex subtractNumber = Complex.subtractComplexNumber(firstComplex, secondComplex);
        assertEquals(new Complex(1,3), subtractNumber);
    }

}