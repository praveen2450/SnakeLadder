package com.java.model;

public class Player {
    String name;
    String color;
    Cell position;

    public Cell getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public void setPosition(Cell position) {
        this.position = position;
    }

    public Player(String name, String color ) {
        this.color=color;
        this.name = name;
    }


}
