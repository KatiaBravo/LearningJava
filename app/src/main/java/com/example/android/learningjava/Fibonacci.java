package com.example.android.learningjava;

/** Created by Kids on 1/31/2016. */
public class Fibonacci {
    public long fibonacciFinding(long n){
        long one = 0;
        long two = 1;

        long a = two + one;
        for(long i = 0; i < n; i++){
            one = two;
            two = a;
            a = two + one;
        }
        return one;
    }
}
