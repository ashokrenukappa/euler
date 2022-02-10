package com.aaak.euler.problem.seven;

import com.aaak.euler.util.SafeNumberParser;

import java.util.stream.IntStream;

public class NthPrime {
    private final static int DEFAULT_NTH_PRIME = 10001;

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, (number/2)).allMatch(n -> number % n != 0);
    }

    public static void main(String [] args){
        int nthPrime = SafeNumberParser.getIntAt(args, 0, DEFAULT_NTH_PRIME);

        int nthPrimeNumber = IntStream.rangeClosed(2, Integer.MAX_VALUE)
                .filter(NthPrime::isPrime)
                .skip(nthPrime - 1).findFirst().getAsInt();

        System.out.println(nthPrimeNumber);

    }
}
