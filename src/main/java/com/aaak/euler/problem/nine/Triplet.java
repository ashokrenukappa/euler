package com.aaak.euler.problem.nine;

public class Triplet {

    int a ;
    int b ;
    int c ;

    public Triplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triplet(Triplet triplet) {
        this.a = triplet.a;
        this.b = triplet.b;
        this.c = triplet.c;
    }

    public int getPerimeter(){
        return this.a + this.b + this.c;
    }

    @Override
    public String toString() {
        return "Triplet{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
