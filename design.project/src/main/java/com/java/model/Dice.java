package com.java.model;

import java.util.Random;

public class Dice {
    private static Dice dice=null;
    private Dice(){

    }
    public static Dice getDice(){
        if(dice==null){
            return new Dice();
        }else{
            return dice;
        }
    }
    public int roll(){
        Random rand=new Random();
        int value=rand.nextInt();
        value=value%6;
        if(value==0){
            return value+1;
        }else{
            return value;
        }
    }
}
