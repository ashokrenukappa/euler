package com.aaak.euler.problem.one;

import com.aaak.euler.util.SafeNumberParser;

public class SumOfMultiplesOf3N5 {

    private final static int DEFAULT_MULTIPLE_N = 1000;

    private static int getMultipleNNumber(String [] args){
        return SafeNumberParser.getIntAt(args,0, DEFAULT_MULTIPLE_N) ;
    }

    public static void main(String [] args){
        long sum = 0 ;
        for(int i=1 ; i<getMultipleNNumber(args); i++){
            if ( i % 3 == 0 || i % 5 == 0 ){
                sum += i ;
            }
        }
        System.out.println(sum);
    }
}
