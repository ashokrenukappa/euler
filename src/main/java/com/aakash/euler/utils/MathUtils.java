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

    /**
     * Counts the number of divisors of a number.
     *
     * @param n The number to count divisors for.
     * @return The number of divisors.
     */
    public static int countDivisors(long n) {
        if (n == 0) {
            return 0;
        }
        int count = 0;
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i == n) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }
}
