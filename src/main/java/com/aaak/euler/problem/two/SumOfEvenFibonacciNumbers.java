package com.aaak.euler.problem.two;

import com.aaak.euler.util.SafeNumberParser;

public class SumOfEvenFibonacciNumbers {
    private final static int DEFAULT_MAX_FIBONACCI_NUM = 4000000;

    private static int getMaxFibonacciNumber(String [] args){
        return SafeNumberParser.getIntAt(args,0, DEFAULT_MAX_FIBONACCI_NUM) ;
    }

    public static void main(String [] args){
        long sum = 0 ;
        int maxFib = getMaxFibonacciNumber(args) ;
        Fibonacci fibonacci = new Fibonacci();
        while(true){
            int nextFib = fibonacci.next();
            if( nextFib <= maxFib ){
                if (nextFib % 2 == 0 ){
                    sum += nextFib;
                }
            }else{
                break;
            }
        }

        System.out.println(sum);
    }
}
