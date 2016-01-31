package com.example.android.learningjava;


// Created by wendy on 11/7/2015.

public class FizzBuzz {
    public String fizzBuzz(int n){
        if (n % 3 != 0 && n % 5 != 0) {
            return "" + n;
        }
        String answer = "";
        if (n % 3 == 0) {
            answer = "Fizz";
        }
        if (n % 5 == 0) {
            answer += "Buzz";
        }
        return answer;
    }

    public String fizzBuzz2_5(int n){
        String answer = "";
        if (n % 3 == 0) {
            answer = "Fizz";
        }
        if (n % 5 == 0) {
            answer += "Buzz";
        }
        return answer.isEmpty() ? "" + n : answer;
    }

    public String fizzBuzz3(int n) {
        if (n % 15 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else {
            return "" + n;
        }

    }
}
