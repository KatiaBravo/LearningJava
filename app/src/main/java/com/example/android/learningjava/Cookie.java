package com.example.android.learningjava;
// Created by wendy on 12/12/2015.

public class Cookie {
    private String mShape;
    private String mDough;
    public Cookie (String dough){
        mShape = "NoShape";
        mDough = dough;
    }
    public String getShape(){
        return mShape;
    }
    public void setShape(String shape) {
        //This returns if it already had shape
        if (mShape.equals("NoShape")) {
            mShape = shape;
        }
    }
    public void crumble(){
        mShape = "NoShape";
    }
}
