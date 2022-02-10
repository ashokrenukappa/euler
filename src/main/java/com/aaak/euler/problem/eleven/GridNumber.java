package com.aaak.euler.problem.eleven;

public class GridNumber {
    int x;
    int y;
    int number;

    public GridNumber(int x, int y, int number) {
        this.x = x;
        this.y = y;
        this.number = number;
    }

    @Override
    public String toString() {
        return "GridNumber{" +
                "x=" + x +
                ", y=" + y +
                ", number=" + number +
                '}';
    }
}
