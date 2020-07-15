package com.sideproject;


import java.util.Map;

public class Controller {

    private Roster roster;

    public Controller(String fileName) {
        roster = new Roster(fileName);
    }

    public Map<String, Team> getTeamRoster() {
        return roster.getTeamRoster();
    }
    
    public String addPointsToDriver(String driverNumber, String points) {
    	Integer driverPoints = Integer.parseInt(points);
    	return roster.getTeamRoster().get(driverNumber).addPointsToDriver(driverPoints);
    }
    
    public String addPointsToConstructor(String driverNumber, String points) {
    	Integer driverPoints = Integer.parseInt(points);
    	return roster.getTeamRoster().get(driverNumber).addPointToConstructor(driverPoints);
    }
}