package com.example.android.learningjava;

/**
 * Created by wendy on 11/29/2015.
 */
public class Loops {
    public int addUsingForLoop(int from, int to) throws Exception {
        if (to < from) {
            throw new IllegalArgumentException ("Harsh life for YOU");
        }
        int sum = 0;
        for(int b = from; b <= to; b++){
            sum = sum + b;
        }
        return sum;
    }
    public int addUsingWhileLoop(int from, int to) throws Exception {
        if (to < from) {
            throw new IllegalArgumentException ("Harsh life while YOU");
        }
        int sum = 0;
        int b = from;
        while(b <= to){
            sum = sum + b;
            b++;
        }
        return sum;
    }
}
