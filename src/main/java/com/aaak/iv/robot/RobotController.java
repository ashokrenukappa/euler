package com.aaak.iv.robot;

import java.util.Scanner;

public class RobotController {

    static int prompt(Scanner scanner) {
        System.out.println("0: Redraw Grid 1: Right , 2: Left , 3: Up, 4: Down, 5: Exit");
        System.out.print("Your choice: ");
        String input = scanner.nextLine();
        int userChoice = 0; // Default redraw
        try {
            userChoice = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            //Ignore
        }
        return userChoice;
    }

    static void moveRobot(int userChoice, Robot robot) {
        switch (userChoice) {
            case 0:
                //Do nothing
                robot.placeMe();
                break;
            case 1:
                robot.moveRight();
                break;
            case 2:
                robot.moveLeft();
                break;
            case 3:
                robot.moveUp();
                break;
            case 4:
                robot.moveDown();
                break;
            case 5:
                System.exit(0);
                break;
        }

    }

    public static void main(String args[]) {
        Robot robot = new Robot(0, 0, new Grid(10, 10));
        robot.placeMe();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                int userChoice = prompt(scanner);
                moveRobot(userChoice, robot);
            }
        }
    }
}
