package com.example.android.learningjava;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/** Created by Kids on 1/31/2016 */
public class FibonacciTest {
    private Fibonacci mFibonacci;

    @Before
    public void setUp() throws Exception {
        mFibonacci = new Fibonacci();
    }

    @Test
    public void testFibonacci1() throws Exception {
        assertEquals(1, mFibonacci.fibonacciFinding(1));
    }

    @Test
    public void testFibonacci2() throws Exception {
        assertEquals(1, mFibonacci.fibonacciFinding(2));
    }

    @Test
    public void testFibonacci3() throws Exception {
        assertEquals(2, mFibonacci.fibonacciFinding(3));
    }

    @Test
    public void testFibonacci6() throws Exception {
        assertEquals(8, mFibonacci.fibonacciFinding(6));
    }

    @Test
    public void testFibonacci30() throws Exception {
        assertEquals(832040, mFibonacci.fibonacciFinding(30));
    }

    @Test
    public void testFibonacci50() throws Exception {
        assertEquals(12586269025L, mFibonacci.fibonacciFinding(50)); // 12B
    }

    @Test
    public void testFibonacci100() throws Exception {
        assertEquals(3736710778780434371L, mFibonacci.fibonacciFinding(100)); // 3GAZILLION
    }
}