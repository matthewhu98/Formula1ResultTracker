package com.sideproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileLoader {

    private String fileName = "";

    public FileLoader(String fileName) {
        this.fileName = fileName;
    }

    public List<Team> loadData() throws FileNotFoundException {
        List<Team> teamList = new ArrayList<>();

        Scanner scanner = new Scanner(new File(fileName));
        try {
             scanner.nextLine();

             while (scanner.hasNextLine()) {
                String record = scanner.nextLine();
                String[] categories = record.split("\\| ");
                
                String driverNumber = categories[0];
                String driverName = categories[1];
                int driverPoints = Integer.parseInt(categories[2]);
                String constructorName = categories[3];
                int constructorPoints = Integer.parseInt(categories[4]);

                Team team = new Team(driverNumber, driverName, driverPoints, constructorName, constructorPoints);
                teamList.add(team);
             }
        } catch (Exception e) {
            e.printStackTrace();
        }

        scanner.close();

        return teamList;
    }

}