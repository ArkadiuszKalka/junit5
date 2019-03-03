package com.infoshareacademy.junit.task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class RangeTest {

    Range range;
    Range range1;

    @BeforeEach
    private void initRanges(){
        range= new Range(10, 20);
        range1= new Range(10, 20);

    }


    @Test
    public void shouldReturnTrueIfNumberInRange() {

        boolean result = range.isInRange(15);
        assertTrue(result,"Number is outside range!");

    }

    @Test
    public void shouldReturnFalseIfNumberIsOutOfRange() {

        boolean result = range.isInRange(20);

        assertTrue(result);
    }


}