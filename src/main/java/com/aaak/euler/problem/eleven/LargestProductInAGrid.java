package com.aaak.euler.problem.eleven;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LargestProductInAGrid {
    final static int EXPECTED_PRODUCT = 70600674;

    public static void main(String args[]) throws IOException, URISyntaxException {

        long start = System.currentTimeMillis();
        Path path = Paths.get(LargestProductInAGrid.class
                .getClassLoader()
                .getResource("euler_11.txt").toURI());

        List<String> lines = Files.lines(path).collect(Collectors.toList());

        int ySize = lines.size();
        int xSize = lines.get(0).split(" ").length;

        String [][] grid = new String[ySize][xSize];

        int yIndex = 0;
        for(String line : lines){
            List<String> row = Arrays.stream(line.split(" ")).collect(Collectors.toList());
            int xIndex = 0;
            for(String rowNum : row){
                grid[yIndex][xIndex++] = rowNum ;
            }
            yIndex++;
        }

        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        //LeftRight Direction Chunks
        List<FourPair> fourPairList = new ArrayList<>();
        for (int y = 0; y < ySize; y++) {
            for (int x = 0; x+3 < xSize; x++) {
                FourPair fourPair = new FourPair("LeftRight");
                fourPair.add(new GridNumber(y, x, Integer.parseInt(grid[y][x])));
                fourPair.add(new GridNumber(y, x+1, Integer.parseInt(grid[y][x+1])));
                fourPair.add(new GridNumber(y, x+2, Integer.parseInt(grid[y][x+2])));
                fourPair.add(new GridNumber(y, x+3, Integer.parseInt(grid[y][x+3])));
                if(!fourPair.anyZero()) {
                    fourPairList.add(fourPair);
                }
            }
        }

        for (int y = 0; y + 3 < ySize; y++) {
            for (int x = 0; x < xSize; x++) {
                FourPair fourPair = new FourPair("TopDown");
                fourPair.add(new GridNumber(y, x, Integer.parseInt(grid[y][x])));
                fourPair.add(new GridNumber(y+1, x, Integer.parseInt(grid[y+1][x])));
                fourPair.add(new GridNumber(y+2, x, Integer.parseInt(grid[y+2][x])));
                fourPair.add(new GridNumber(y+3, x, Integer.parseInt(grid[y+3][x])));
                if(!fourPair.anyZero()) {
                    fourPairList.add(fourPair);
                }
            }
        }

        for (int y = 0; y+3 < ySize; y++) {
            for (int x = 0; x+3 < xSize; x++) {
                FourPair fourPair = new FourPair("LeftToRightDiagonal");
                fourPair.add(new GridNumber(y, x, Integer.parseInt(grid[y][x])));
                fourPair.add(new GridNumber(y+1, x+1, Integer.parseInt(grid[y+1][x+1])));
                fourPair.add(new GridNumber(y+2, x+2, Integer.parseInt(grid[y+2][x+2])));
                fourPair.add(new GridNumber(y+3, x+3, Integer.parseInt(grid[y+3][x+3])));
                if(!fourPair.anyZero()) {
                    fourPairList.add(fourPair);
                }
            }
        }

        for (int y = 0; y+3 < ySize; y++) {
            for (int x = 3; x < xSize; x++) {
                FourPair fourPair = new FourPair("RightToLeftDiagonal");
                fourPair.add(new GridNumber(y, x, Integer.parseInt(grid[y][x])));
                fourPair.add(new GridNumber(y+1, x-1, Integer.parseInt(grid[y+1][x-1])));
                fourPair.add(new GridNumber(y+2, x-2, Integer.parseInt(grid[y+2][x-2])));
                fourPair.add(new GridNumber(y+3, x-3, Integer.parseInt(grid[y+3][x-3])));
                if(!fourPair.anyZero()) {
                    fourPairList.add(fourPair);
                }
            }
        }

        System.out.println(fourPairList.size());
        Optional<FourPair> fourPair = fourPairList.stream().max(Comparator.comparingLong(FourPair::product));

        if(fourPair.isPresent()){
            System.out.println(fourPair);
            System.out.println(fourPair.get().product());
            if(fourPair.get().product() == EXPECTED_PRODUCT){
                System.out.println("HURRRAAAAAYYYYY");
            }
        }
        System.out.println("Completed, time taken: "+ System.currentTimeMillis() - start +" milliseconds");



        /*
        The greatest product of 4 entries, is 70600674
        */

    }


}
