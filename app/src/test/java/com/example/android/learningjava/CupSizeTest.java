package com.example.android.learningjava;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class CupSizeTest {
    private CupSize mCupSize;
    @Before
    public void setUp() throws Exception {
        mCupSize = new CupSize();
    }

    @Test
    public void testCalculateCupSize() throws Exception {
        assertEquals("S", mCupSize.calculateCupSize(5));
        assertEquals("G", mCupSize.calculateCupSize(17));
        assertEquals("M", mCupSize.calculateCupSize(9));

        assertEquals("not valid", mCupSize.calculateCupSize(64));
        assertEquals("not valid", mCupSize.calculateCupSize(-2));
    }
}