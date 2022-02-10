package com.aaak.euler.problem.eleven;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class FourPair {
    List<GridNumber> adjacentNumbers = new ArrayList<>();
    String direction;

    public FourPair(String direction) {
        this.direction = direction;
    }

    void add(GridNumber gridNumber){
        adjacentNumbers.add(gridNumber);
    }

    public int product(){
        return adjacentNumbers.stream().map(gridNumber -> gridNumber.number).reduce(1,this::multiply);
    }

    private int multiply(Integer i1, Integer i2) {
        return i1 * i2;
    }

    boolean anyZero(){
        return adjacentNumbers.stream().anyMatch(gridN -> gridN.number == 0);
    }

    @Override
    public String toString() {
        return "FourPair{" +
                "adjacentNumbers=" + adjacentNumbers +
                ", direction='" + direction + '\'' +
                '}';
    }
}
