package com.aaak.euler.problem.ten;

import com.aaak.euler.problem.seven.NthPrime;
import com.aaak.euler.util.SafeNumberParser;
import com.aaak.euler.util.TimeUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeSummation {

    private final static int END_NUMBER = 2000000;

    private static long sieveOfEratosthenesJava8(int n)
    {
        List<Boolean> primeList = new java.util.ArrayList<>(Collections.nCopies(n + 1, true));
        for(int p = 2; p*p <=n; p++){
            if(primeList.get(p)){//If not a prime
                for(int i = p*p; i <= n; i += p)
                    primeList.set(i, false);
            }
        }

        long sum = 0 ;
        for(int i = 2; i <= n; i++){
            if(primeList.get(i))
                sum += i;
        }

        return sum;
    }

    // https://www.geeksforgeeks.org/sieve-of-eratosthenes/
    private static long sieveOfEratosthenes(int n)
    {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<n;i++)
            prime[i] = true;

        for(int p = 2; p*p <=n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p])
            {
                // Update all multiples of p
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }


        long sum = 0;
        for(int i = 2; i <= n; i++){
            if(prime[i] == true)
                sum += i;
        }
        return sum;
    }

    private static long bruteForce(int endNumber){
        long sum = IntStream.range(2, endNumber)
                .filter(NthPrime::isPrime).sum();
        //8m 18s
        return sum; // 142,913,828,922 - 1179908154
    }

    public static void main(String [] args){
        int endNumber = SafeNumberParser.getIntAt(args, 0, END_NUMBER);

        // 142,913,828,922
        //8m 18s
        long start = System.currentTimeMillis();
        System.out.println(sieveOfEratosthenes(endNumber)); // 142,913,828,922 - 1179908154
        System.out.println("Time taken by sieveOfEratosthenes = " + TimeUtil.friendlyTime(System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        System.out.println(sieveOfEratosthenesJava8(endNumber)); // 142,913,828,922 - 1179908154
        System.out.println("Time taken by sieveOfEratosthenesJava8 = " + TimeUtil.friendlyTime(System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        //System.out.println(bruteForce(endNumber)); // 1179908154
        System.out.println("Time taken by bruteForce = " +
                TimeUtil.friendlyTime(System.currentTimeMillis() - start));


    }
}
