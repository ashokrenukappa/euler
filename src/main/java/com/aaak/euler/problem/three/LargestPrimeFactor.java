package com.aaak.euler.problem.three;

import com.aaak.euler.util.SafeNumberParser;

import java.util.ArrayList;
import java.util.List;

public class LargestPrimeFactor {
    private final static long DEFAULT_NUMBER = 600851475143L;

    public static void main(String[] args) {
        long n = SafeNumberParser.getLongAt(args,0, DEFAULT_NUMBER);
        List<Long> factors = new ArrayList<>();
        for (long i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        System.out.println(factors);
    }
}
