package com.example.android.learningjava;

/**
 * Created by wendy on 11/1/2015.
 */
public class CupSize {

    public String calculateCupSize(int cupSize) {
        if (cupSize <= 0) {
            return "not valid";
        } else if (cupSize <= 8) {
            return "S";
        } else if (cupSize <= 12) {
            return "M";
        } else if (cupSize <= 16) {
            return "L";
        } else if (cupSize <= 32) {
            return "G";
        } else {
            return "not valid";
        }
    }
}
