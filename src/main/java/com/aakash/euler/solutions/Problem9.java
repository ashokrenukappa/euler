package com.aakash.euler.solutions;

public class Problem9 {

    public static void main(String[] args) {
        System.out.println("Problem 9 solution: " + solve());
    }

    public static long solve() {
        int sum = 1000;
        for (int a = 1; a < sum / 3; a++) {
            for (int b = a + 1; b < sum / 2; b++) {
                int c = sum - a - b;
                if (a * a + b * b == c * c) {
                    return (long) a * b * c;
                }
            }
        }
        return -1; // Should not happen for the given problem
    }
}
