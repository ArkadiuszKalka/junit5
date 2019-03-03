package com.infoshareacademy.junit.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

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
    @ParameterizedTest(name = "{index}  {0} should by divided by 3")
    @ValueSource(ints = {3, 6, 9, 99})
    public void verifyIfReturnBuzzWhenDdivisableByThree(int number) {

        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "Fizz!";
        String actualResult = fizzBuzz.play(number);

        assertEquals(expectedResult, actualResult);
    }


    @DisplayName("Should return Buzz if number is divisible by five")
    @ParameterizedTest(name = "{index} - value {0}")
    @MethodSource("dataProvider")
    public void shouldReturnBuzzWhenDivisableBy5(int number) {

        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "Buzz!";
        String actualResult = fizzBuzz.play(number);

        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Integer> dataProvider() {
        return Stream.of(5, 20, 110, 205, 10000);

    }

    @DisplayName("Should return expected value")
    @ParameterizedTest(name = "{index} - for {0} should return {1}")
    @MethodSource("argumentProvider")
    public void shouldReturnExpectedValue(int number, String expectedResult) {

        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.play(number);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> argumentProvider() {
        return Stream.of(
                Arguments.arguments(1, "1"),
                Arguments.arguments(3, "Fizz!"),
                Arguments.arguments(5, "Buzz!"),
                Arguments.arguments(15, "FizzBuzz!")

        );
    }

}

