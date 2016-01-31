package com.example.android.learningjava;

import org.junit.Test;
// Created by wendy on 12/12/2015.

public class CookieTest {

//    @Before
//    public void setUp() throws Exception {
//
//    }

    @Test
    public void testSetShape() throws Exception {
        Cookie ginger = new Cookie("rice");
        ginger.setShape("star");
        ginger.crumble();
        ginger.setShape("circle");
        String cookieShape = ginger.getShape();
        if (!cookieShape.equals("circle")){
            System.out.print("Harsh life for YOU!");
        } else {
            System.out.print("Luckster!");
        }
    }
}