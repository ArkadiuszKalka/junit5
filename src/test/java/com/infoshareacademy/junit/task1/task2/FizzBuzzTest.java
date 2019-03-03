package com.infoshareacademy.junit.task1.task2;

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
    public void shouldReturnFizzBuzz(){

        FizzBuzz fizzBuzz= new FizzBuzz();
        String test = fizzBuzz.play(15);
        assertEquals(test,"FizzBuzz!");
    }

    @Test
    public void shouldReturnInt(){

        FizzBuzz fizzBuzz= new FizzBuzz();
        String test = fizzBuzz.play(1);
        assertEquals(test,"1");
    }


}

