package com.aakash.euler.solutions;

import com.aakash.euler.utils.MathUtils;

public class Problem10 {

    public static void main(String[] args) {
        System.out.println("Problem 10 solution: " + solve());
    }

    public static long solve() {
        long sum = 0;
        for (long i = 2; i < 2000000; i++) {
            if (MathUtils.isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
