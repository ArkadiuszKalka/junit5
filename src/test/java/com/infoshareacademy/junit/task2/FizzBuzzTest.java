package com.infoshareacademy.junit.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {


    @Test
    public void shouldReturnFizz() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        String test = fizzBuzz.play(9);
        assertEquals(test, "Fizz!");
    }

    @Test
    public void shouldReturnBuzz() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        String test = fizzBuzz.play(10);
        assertEquals(test, "Buzz!");
    }

    @Test
    @DisplayName("Should return FizzBazz")
    public void shouldReturnFizzBuzz() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        String test = fizzBuzz.play(15);
        assertEquals(test, "FizzBuzz!");
    }

    @Test
    public void shouldReturnIntValue() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        String test = fizzBuzz.play(1);
        assertEquals(test, "1");
    }

    @Test
    @DisplayName("Should throw Exception when number equals zero")
    public void shouldThrowExceptionForNumberEqualsZero() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertThrows(ArithmeticException.class, () -> fizzBuzz.play(0));
    }

    @Test
    @DisplayName("Should throw Exception when number bellow zero")
    public void shouldThrowExceptionForNumberBellowZero() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertThrows(ArithmeticException.class, () -> fizzBuzz.play(-5));
    }
    @DisplayName("Should return Fizz if number is divisible by three")
    @ParameterizedTest(name="{index}  {0} should by divided by 3" )
    @ValueSource(ints = { 3, 6, 9, 99})
    public void verifyIfReturnBuzzWhenDdivisableByThree(int number) {

        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult="Fizz!";
        String actualResult = fizzBuzz.play(number);

        assertEquals(expectedResult,actualResult);
    }



}

