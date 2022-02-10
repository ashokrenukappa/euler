package com.aaak.euler.problem.nine;

import java.math.BigInteger;

public class PTriplet {

    private int perimeterLimit = 10;

    Triplet triplet = new Triplet(3,4,5);

    public PTriplet(int perimeterLimit) {
        this.perimeterLimit = perimeterLimit;
    }

    boolean gcd(int x, int y){
        BigInteger bX = BigInteger.valueOf(x);
        BigInteger bY = BigInteger.valueOf(y);
        BigInteger gcd = bX.gcd(bY);
        System.out.println(" gcd.intValue() = "+ gcd.intValue());
        return gcd.intValue() == 1;
    }

    boolean isPythogorean(Triplet triplet){
        return ( triplet.a * triplet.a ) + ( triplet.b * triplet.b ) == ( triplet.c * triplet.c );
    }

    Triplet next(){
        if(triplet.getPerimeter() >= perimeterLimit){
            return null;
        }

        Triplet tmpTriplet = new Triplet(triplet);
        if(gcd(tmpTriplet.a,tmpTriplet.b) && isPythogorean(tmpTriplet) ){
            tmpTriplet = new Triplet(triplet.a, triplet.b, triplet.c + 1);
            return tmpTriplet;
        }
        return triplet;
    }


}
