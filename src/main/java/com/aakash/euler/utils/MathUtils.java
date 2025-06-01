package com.aakash.euler.utils;

public class MathUtils {

    /**
     * Checks if a number is prime.
     *
     * @param n The number to check.
     * @return True if the number is prime, false otherwise.
     */
    public static boolean isPrime(long n) {
        if (n < 2) {
            return false;
        }
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
