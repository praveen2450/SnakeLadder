package com.java.model;

public class Snake implements SnakeLadder{
    int id;
    Cell start;
    Cell end;
    public Snake(int id,Cell start, Cell end) {
        this.id=id;
        this.start = start;
        this.end = end;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
