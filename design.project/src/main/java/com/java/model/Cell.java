package com.java.model;

public class Cell {
    int i;
    int j;

    public int getI() {
        return i;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public Cell(int i, int j) {
        this.i = i;
        this.j = j;
    }
}
