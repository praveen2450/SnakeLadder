package com.java.model;

public class Ladder implements SnakeLadder{
    int id;
    Cell start;
    Cell end;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ladder(int id,Cell start, Cell end) {
        this.id=id;
        this.start = start;
        this.end = end;
    }


}
