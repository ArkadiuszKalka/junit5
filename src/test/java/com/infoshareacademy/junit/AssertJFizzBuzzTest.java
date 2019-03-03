package com.infoshareacademy.junit;

import com.infoshareacademy.junit.task2.FizzBuzz;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.assertj.core.api.Java6Assertions.assertThatThrownBy;

public class AssertJFizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void shouldReturnFizzWhen1() {
        int number = 1;
        assertThat(fizzBuzz.play(number))
                .isNotNull()
                .isEqualTo("1")
                .isNotBlank()
                .isNotEmpty();

    }

    @Test
    public void shouldReturnFizzWhen3() {
        int number = 3;
        assertThat(fizzBuzz.play(number))
                .isNotNull()
                .isEqualTo("Fizz!");
    }

    @Test
    public void shouldReturnFizzWhen5() {
        int number = 5;
        assertThat(fizzBuzz.play(number))
                .overridingErrorMessage("Moja wiadomość")
                .isNotNull()
                .isEqualTo("Buzz!");
    }

    @Test
    public void shouldReturnFizzWhen3and5() {
        int number = 15;
        assertThat(fizzBuzz.play(number))
                .isNotNull()
                .isEqualTo("FizzBuzz!");

    }

    @Test
    public void shouldThrowExceptionForNegativeNumber() {
        int number = -1;
        assertThatThrownBy(() -> fizzBuzz.play(number))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Number cannot be equal 0 or negative!");
    }

    @Test
    public void shouldReturnCorrectValue() {

        int number1 = -1;
        int number2 = 0;

        SoftAssertions softly = new SoftAssertions();

        softly.assertThatThrownBy(()-> fizzBuzz.play(number1))
                .isInstanceOf(ArithmeticException.class);
        softly.assertThatThrownBy(()->fizzBuzz.play(number2))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Number cannot be equal 0 or negative!");
        softly.assertAll();
    }


}
