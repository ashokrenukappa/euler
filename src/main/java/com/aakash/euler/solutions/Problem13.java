package com.aakash.euler.solutions;

import com.aakash.euler.utils.FileUtils;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;

public class Problem13 {

    private static final String FILE_PATH = "src/main/resources/euler_13.txt";

    public static void main(String[] args) throws IOException {
        System.out.println("Problem 13 solution: " + solve());
    }

    public static String solve() throws IOException {
        List<String> lines = FileUtils.readLines(FILE_PATH);
        BigInteger sum = BigInteger.ZERO;
        for (String line : lines) {
            // Ensure only the first 50 characters are parsed if a line is longer
            // though BigInteger should handle trailing spaces/zeros correctly.
            // For safety and clarity, explicitly handle substring if needed,
            // but current BigInteger constructor handles varied length strings.
            sum = sum.add(new BigInteger(line.trim()));
        }
        return sum.toString().substring(0, 10);
    }
}
