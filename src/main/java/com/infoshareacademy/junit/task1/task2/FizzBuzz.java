package com.infoshareacademy.junit.task1.task2;

public class FizzBuzz {
    public String play(int value) {

        String answer=Integer.toString(value);

        if(value<=0){
            throw new ArithmeticException("Number cannot be equal 0 or negative!");
        }

        if (value % 5 == 0 && value % 3 == 0) answer = "FizzBuzz!";
        else if (value % 3 == 0) answer = "Fizz!";
        else if (value % 5 == 0) answer = "Buzz!";

        return answer;

    }

}