package com.aaak.euler.problem.six;

import com.aaak.euler.util.SafeNumberParser;

import java.util.stream.IntStream;

public class SumSquareDifference {

    private final static int DEFAULT_MIN = 1;
    private final static int DEFAULT_MAX = 100;

    public static void main(String [] args){
        int min = SafeNumberParser.getIntAt(args, 0, DEFAULT_MIN);
        int max = SafeNumberParser.getIntAt(args, 0, DEFAULT_MAX);

        int squareOf1ToN = IntStream.rangeClosed(min,max).map(n  -> n * n).reduce(0, Integer::sum);
        int sumOf1ToN = IntStream.rangeClosed(min,max).reduce(0, Integer::sum);
        int squareOfSumOf1ToN = sumOf1ToN * sumOf1ToN;

        System.out.println(squareOfSumOf1ToN - squareOf1ToN);
    }
}
