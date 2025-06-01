package com.aakash.euler.solutions;

import com.aakash.euler.utils.FileUtils;

import java.io.IOException;
import java.util.List;

public class Problem11 {

    private static final String FILE_PATH = "src/main/resources/euler_11.txt";
    private static final int GRID_SIZE = 20;
    private static final int ADJACENT_NUMBERS = 4;

    public static void main(String[] args) throws IOException {
        System.out.println("Problem 11 solution: " + solve());
    }

    public static long solve() throws IOException {
        int[][] grid = readGrid();
        long maxProduct = 0;

        // Horizontal product
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j <= GRID_SIZE - ADJACENT_NUMBERS; j++) {
                long currentProduct = 1;
                for (int k = 0; k < ADJACENT_NUMBERS; k++) {
                    currentProduct *= grid[i][j + k];
                }
                if (currentProduct > maxProduct) {
                    maxProduct = currentProduct;
                }
            }
        }

        // Vertical product
        for (int i = 0; i <= GRID_SIZE - ADJACENT_NUMBERS; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                long currentProduct = 1;
                for (int k = 0; k < ADJACENT_NUMBERS; k++) {
                    currentProduct *= grid[i + k][j];
                }
                if (currentProduct > maxProduct) {
                    maxProduct = currentProduct;
                }
            }
        }

        // Diagonal product (top-left to bottom-right)
        for (int i = 0; i <= GRID_SIZE - ADJACENT_NUMBERS; i++) {
            for (int j = 0; j <= GRID_SIZE - ADJACENT_NUMBERS; j++) {
                long currentProduct = 1;
                for (int k = 0; k < ADJACENT_NUMBERS; k++) {
                    currentProduct *= grid[i + k][j + k];
                }
                if (currentProduct > maxProduct) {
                    maxProduct = currentProduct;
                }
            }
        }

        // Diagonal product (top-right to bottom-left)
        for (int i = 0; i <= GRID_SIZE - ADJACENT_NUMBERS; i++) {
            for (int j = ADJACENT_NUMBERS - 1; j < GRID_SIZE; j++) {
                long currentProduct = 1;
                for (int k = 0; k < ADJACENT_NUMBERS; k++) {
                    currentProduct *= grid[i + k][j - k];
                }
                if (currentProduct > maxProduct) {
                    maxProduct = currentProduct;
                }
            }
        }

        return maxProduct;
    }

    private static int[][] readGrid() throws IOException {
        List<String> lines = FileUtils.readLines(FILE_PATH);
        int[][] grid = new int[GRID_SIZE][GRID_SIZE];
        for (int i = 0; i < GRID_SIZE; i++) {
            String[] numbers = lines.get(i).split(" ");
            for (int j = 0; j < GRID_SIZE; j++) {
                grid[i][j] = Integer.parseInt(numbers[j]);
            }
        }
        return grid;
    }
}
