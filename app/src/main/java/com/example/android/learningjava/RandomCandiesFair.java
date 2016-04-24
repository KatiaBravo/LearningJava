package com.example.android.learningjava;

import java.util.ArrayList;

/**
 * Created by wendy on 4/24/2016.
 */
public class RandomCandiesFair {

    public static double rand(){
        return Math.random();
    }
    public static void kidCandies(){
        ArrayList<Integer> needCandy = new ArrayList<Integer>();
        for (int k = 0;k < 10;k++){
            needCandy.add(k,k);
        }
        for (int d = 0;d < 10;d++){
            int index = (int)(rand() * (10 - d));
            System.out.print(needCandy.get(index) + ", ");
            needCandy.remove(index);
        }
        System.out.println();
    }
    //Maxim added this
    public static void testCandies(int numOfTimes){
        for(int i = 0; i < numOfTimes; i++){
            kidCandies();
        }
    }
}
