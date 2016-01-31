package com.example.android.learningjava;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
//Created by wendy on 11/29/2015.

public class LoopsTest {
    private Loops mLoops;
    @Before
    public void setUp() throws Exception {
        mLoops = new Loops();
    }

    @Test
    public void testForAndWhileLoops() throws Exception {
        //assertEquals(mLoops.addUsingWhileLoop(), mLoops.addUsingForLoop());
        assertEquals(1530, mLoops.addUsingForLoop(5, 55));
        assertEquals(1530, mLoops.addUsingWhileLoop(5, 55));

        assertEquals(26, mLoops.addUsingForLoop(5, 8));
        assertEquals(26, mLoops.addUsingWhileLoop(5, 8));

        assertEquals(5, mLoops.addUsingForLoop(5, 5));
        assertEquals(5, mLoops.addUsingWhileLoop(5, 5));

        assertEquals(9, mLoops.addUsingForLoop(4, 5));
        assertEquals(9, mLoops.addUsingWhileLoop(4, 5));
    }

    @Test(expected=IllegalArgumentException.class)
    public void testHarshLives() throws Exception {
        assertEquals(0, mLoops.addUsingForLoop(5, 4));
        assertEquals(0, mLoops.addUsingWhileLoop(5, 4));
    }

    @Test
    public void testHarshLifeForYou() throws Exception {
        try {
            mLoops.addUsingForLoop(5, 4);
            fail( "My method didn't throw when I expected it to" );
        } catch (IllegalArgumentException expectedException) {
            assertEquals("Harsh life for YOU", expectedException.getMessage());
        }
    }

    @Test
    public void testHarshLifeWhileYou() throws Exception {
        try {
            mLoops.addUsingWhileLoop(5, 4);
            fail("My method didn'throw when I expected it to" );
        } catch (IllegalArgumentException expectedException) {
            assertEquals("Harsh life while YOU", expectedException.getMessage());
        }
    }

}