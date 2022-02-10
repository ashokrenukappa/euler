package com.aaak.iv.robot;

public class Robot {
    int x;
    int y;
    char robo = 'X';
    Grid grid;

    public Robot(int x, int y, Grid grid) {
        this.x = x;
        this.y = y;
        this.grid = grid;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getRobo() {
        return robo;
    }

    boolean moveLeft(){
        boolean moved = false;
        if(x>0){
            x--;
            moved = true;
        }
        placeMe();
        return moved;
    }

    boolean moveRight(){
        boolean moved = false;
        if(x < grid.xMax - 1){
            x++;
            moved = true;
        }
        placeMe();
        return moved;
    }

    boolean moveUp(){
        boolean moved = false;
        if(y > 0){
            y--;
            moved = true;
        }
        placeMe();
        return moved;
    }

    boolean moveDown(){
        boolean moved = false;
        if(y < grid.yMax - 1){
            y++;
            moved = true;
        }
        placeMe();
        return moved;
    }

    void placeMe(){
        grid.draw(this);
    }

}
