package com.aakash.euler.solutions;

import com.aakash.euler.utils.MathUtils;

public class Problem12 {

    public static void main(String[] args) {
        System.out.println("Problem 12 solution: " + solve());
    }

    public static long solve() {
        long triangleNumber = 0;
        long i = 1;
        while (true) {
            triangleNumber += i;
            if (MathUtils.countDivisors(triangleNumber) > 500) {
                return triangleNumber;
            }
            i++;
        }
    }
}
