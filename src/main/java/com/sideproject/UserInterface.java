package com.sideproject;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Scanner userInput = new Scanner(System.in);


    public String mainMenu() {
        System.out.println("Formula 1 Result Tracker (in progress)\n");
        System.out.println("1. View all drivers.");
        System.out.println("2. Add points to a driver");
        System.out.println("3. Add points to a constructor");
        System.out.println("4. Exit");
        return userInput.nextLine();
    }

    public void displayDriverInformation(List<Team> teamList) {
        for (Team driver : teamList) {
            System.out.println(driver.getDriverNumber() + " " + driver.getDriverName() + ": " + driver.getConstructorName());
        }

        for (Team constructor : teamList) {
            System.out.println(constructor.getConstructorName() + ": " + constructor.getConstructorPoints());
        }
    }

}