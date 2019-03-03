package com.infoshareacademy.junit.task1.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {


    @Test
    public void shouldReturnFizz(){

        FizzBuzz fizzBuzz= new FizzBuzz();
        String test = fizzBuzz.play(9);
        assertEquals(test,"Fizz!");
    }

    @Test
    public void shouldReturnBuzz(){

        FizzBuzz fizzBuzz= new FizzBuzz();
        String test = fizzBuzz.play(10);
        assertEquals(test,"Buzz!");
    }

    @Test
    @DisplayName("Should return FizzBazz")
    public void shouldReturnFizzBuzz(){

        FizzBuzz fizzBuzz= new FizzBuzz();
        String test = fizzBuzz.play(15);
        assertEquals(test,"FizzBuzz!");
    }

    @Test
    public void shouldReturnIntValue(){

        FizzBuzz fizzBuzz= new FizzBuzz();
        String test = fizzBuzz.play(1);
        assertEquals(test,"1");
    }

    @Test
    public void shouldThrowExceptionForNumberEqualsZero(){

        FizzBuzz fizzBuzz= new FizzBuzz();
        //String test = fizzBuzz.play(0);
        Assertions.assertThrows(ArithmeticException.class, () ->fizzBuzz.play(0));

    }

}

