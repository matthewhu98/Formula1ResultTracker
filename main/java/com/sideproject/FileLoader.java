package com.sideproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FileLoader {

    private String fileName = "";

    public FileLoader(String fileName) {
        this.fileName = fileName;
    }

    public Map<String, Team> loadData() throws FileNotFoundException {
        Map<String, Team> teamMap = new LinkedHashMap<>();

        Scanner scanner = new Scanner(new File(fileName));
        try {
             while (scanner.hasNextLine()) {
                String record = scanner.nextLine();
                String[] categories = record.split("\\|");
                String driverNumber = categories[0];
                String driverName = categories[1];
                String driverPoints = categories[2];  
                String constructorName = categories[3];
                String constructorPoints = categories[4]; 
                Team team = new Team(driverNumber, driverName, driverPoints, constructorName, constructorPoints);
                teamMap.put(driverNumber, team);
             }
        } catch (NumberFormatException n) {
        	n.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        scanner.close();

        return teamMap;
    }

}