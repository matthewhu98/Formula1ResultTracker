package com.sideproject;
import java.util.Map;
import java.util.Scanner;

public class UserInterface {

    private Scanner userInput = new Scanner(System.in);


    public String mainMenu() {
        System.out.println("Formula 1 Result Tracker (in progress)\n");
        System.out.println("1. View driver and constructor results.");
        System.out.println("2. Add points to a driver");
        System.out.println("3. Exit");
        return userInput.nextLine();
    }

    public void displayDriverInformation(Map<String, Team> teamMap) {
    System.out.println("\nDrivers");
       for (Map.Entry<String, Team> entry : teamMap.entrySet()) {
            System.out.format("%-5s", entry.getKey().toString() + " ");
            System.out.format("%-5s", entry.getValue().getDriverName() + ": ");
            System.out.format("%5s", entry.getValue().getDriverPoints() + "\n");
       }
    }
    
    public void displayConstructorInformation(Map<String, Team> teamMap) {
         int count = 0;
    	 System.out.println("\nConstructors");
         for (Map.Entry<String, Team> entry : teamMap.entrySet()) {
         	if (count % 2 == 1) {
         		 System.out.printf("%-10s",entry.getValue().getConstructorName() + ": " + entry.getValue().getConstructorPoints() + "\n");
         	}
            count++;
         }
    }
    
    public String selectDriver() {
    	System.out.print("Enter the number of the driver to who you want to add points: ");
    	return userInput.nextLine();
    }
    
    public String addPointsToDriver(String driver) {
    	System.out.println("How many points did " + driver + " get this weekend?");
    	return userInput.nextLine();
    }

    public void errorMessage() {
    	System.out.println("Invalid choice.");
    }
    
    public void driverDoesNotExist() {
    	System.out.println("Sorry, that driver number is not associated with a driver on the current grid. Choose another driver.");
    }
}