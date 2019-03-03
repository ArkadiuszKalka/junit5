package com.infoshareacademy.junit;

import com.infoshareacademy.junit.task2.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class AssertJFizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void shouldReturnFizzWhen1() {
        int number = 1;
        assertThat(fizzBuzz.play(number))
                .isNotNull()
                .isEqualTo("1");

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


}
