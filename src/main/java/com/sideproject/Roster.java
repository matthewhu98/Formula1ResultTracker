package com.sideproject;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Roster {

    private List<Team> teamRoster = new ArrayList<>();

    public Roster(String fileName) {
        try {
            loadDriverData(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //sorts driver information according to driver number
    private void loadDriverData(String fileName) throws FileNotFoundException {
        FileLoader fileLoader = new FileLoader(fileName);
        List<Team> teamList = fileLoader.loadData();
        for (Team team : teamList) {
            this.teamRoster.add(team);
        }
    }

    public List<Team> getAllTeams() {
        List<Team> listOfTeams = new ArrayList<>();
        for (Team team : listOfTeams) {
            listOfTeams.add(team);
        }
        return listOfTeams;
    }
}