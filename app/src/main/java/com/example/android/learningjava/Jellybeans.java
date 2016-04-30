package com.example.android.learningjava;
import java.util.*;
/**
 * Created by wendy on 4/30/2016.
 */
public class Jellybeans {
    public static void calculateDead (){
        int dead = 0;
        int smartDead = 0;
        for (int i = 0;i < 100000;i++){
            int pick = (int) (Math.random() * 3);
            int remove = 0;
            if (0==pick){
                remove = 1;
            }
            int pick2 = 2;
            if (pick == 2){
                pick2 = 1;
            }
            if (pick2 != 2){
                smartDead++;
            }
            if (pick != 2){
                dead++;
            }
        }
        System.out.println("dead=" + dead);
        System.out.println("smartDead=" + smartDead);
    }

}
