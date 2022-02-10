package com.aaak.euler.problem.five;

import java.util.stream.IntStream;

public class SmallestMultiple {

    static boolean evenlyDivisiable(int number, int maxRange){
        return IntStream.rangeClosed(2, maxRange).allMatch(n -> number % n == 0);
    }

    public static void main(String [] args){
        for(int i=20; i < Integer.MAX_VALUE; i++){
            if(evenlyDivisiable(i, 20)){
                System.out.println(i);
                break;
            }
        }
    }
}
