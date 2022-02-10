package com.aaak.euler.problem.two;

import java.util.Iterator;
/*
Write an iterator that gives fibonacci numbers,
Do not worry about Integer Overflow
 */
public class Fibonacci implements Iterator<Integer> {
    private int prev1 = 1 ;
    private int prev2 = 2;
    private int nextFib = prev2 ;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int f = nextFib;
        nextFib = prev1 + prev2;
        prev1 = prev2;
        prev2 = nextFib;
        return f;
    }

}
