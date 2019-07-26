package com.java.model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    List<Snake>snakes;
    List<Ladder>ladders;

    public Board() {
        snakes=new ArrayList<>();
        ladders=new ArrayList<>();
    }

    public void setSnakeLadder(SnakeLadder snakeLadder){

    }

    public void init(){
        //setSnakeLadder();
    }


}
