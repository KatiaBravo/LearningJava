package com.example.android.learningjava;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
// Created by wendy on 11/7/2015.

public class FizzBuzzTest {
    private FizzBuzz mFizzBuzz;
    @Before
    public void setUp() throws Exception {
        mFizzBuzz = new FizzBuzz();
    }

    @Test
    public void testFizz() throws Exception{
        assertEquals("Fizz", mFizzBuzz.fizzBuzz(3));
    }


    @Test
    public void testBuzz() throws Exception{
        assertEquals("Buzz", mFizzBuzz.fizzBuzz(5));
    }
    @Test
    public void testFizzBuzz() throws Exception{
        assertEquals("FizzBuzz", mFizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz", mFizzBuzz.fizzBuzz(30));
        assertEquals("FizzBuzz", mFizzBuzz.fizzBuzz(150));
    }
    @Test
    public void testNumber() throws Exception{
        assertEquals("7" , mFizzBuzz.fizzBuzz(7));
    }
}