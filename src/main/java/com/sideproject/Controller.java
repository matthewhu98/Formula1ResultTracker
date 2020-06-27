package com.sideproject;

import java.util.List;

public class Controller {

    private Roster roster;

    public Controller(String fileName) {
        roster = new Roster(fileName);
    }

    public List<Team> getAllTeams() {
        return roster.getAllTeams();
    }
}