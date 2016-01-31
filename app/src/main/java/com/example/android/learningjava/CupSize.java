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

//    public String calculateCupSize(int cupSize) {
//        switch (cupSize) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//            case 6:
//            case 7:
//            case 8:
//                return "S";
//
//            case 9:
//            case 10:
//            case 11:
//            case 12:
//                return "M";
//
//            case 13:
//            case 14:
//            case 16:
//                return "L";
//
//            case 17:
//            case 18:
//            case 19:
//            case 20:
//            case 21:
//            case 22:
//            case 23:
//            case 24:
//            case 25:
//            case 26:
//            case 27:
//            case 28:
//            case 29:
//            case 30:
//            case 31:
//            case 32:
//                return "G";
//
//            default:
//                return "not valid";
//        }
//    }
}