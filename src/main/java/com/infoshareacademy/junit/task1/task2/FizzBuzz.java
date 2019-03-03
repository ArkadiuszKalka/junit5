package com.infoshareacademy.junit.task1.task2;

public class FizzBuzz {
    public static String play(int value) {

        String answer=Integer.toString(value);

        if (value % 3 == 0) answer = "Fizz!";
        if (value % 5 == 0) answer = "Buzz!";
        if (value % 5 == 0 && value % 3 == 0) answer = "FizzBuzz!";

        return answer;

    }
}