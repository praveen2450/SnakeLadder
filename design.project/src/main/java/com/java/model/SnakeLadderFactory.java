package com.java.model;

public class SnakeLadderFactory {
    public SnakeLadder getSnakeLadder(int id,Cell start,Cell end){
        if(start==null||end==null){
            return null;
        }
         if(start.i>end.i){
             return new Snake(id,start,end);
         }else{
             return new Ladder(id,start,end);
         }
    }
}
