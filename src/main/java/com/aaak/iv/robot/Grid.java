package com.aaak.iv.robot;

import java.util.Collections;
import java.util.stream.IntStream;

public class Grid {
    int xMax;
    int yMax;

    public Grid(int xMax, int yMax) {
        this.xMax = xMax;
        this.yMax = yMax;
    }

    void draw(Robot robot) {
        System.out.println();
        System.out.println(String.join("", Collections.nCopies(xMax*3, "-")));

        for (int y = 0; y < yMax; y++) {
            for (int x = 0; x < xMax; x++) {
                if(robot.x == x && robot.y == y){
                    placeRobot(robot.robo);
                }else{
                    drawEmpty();
                }
            }
            System.out.println();
        }
        System.out.println(String.join("", Collections.nCopies(xMax*3, "-")));
        System.out.println();
    }

    void drawEmpty() {
        System.out.print(" - ");
    }

    void placeRobot(char c) {
        System.out.print(" " + c + " ");
    }


}
