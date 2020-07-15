package com.sideproject;

import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Roster {
    
    private Map<String, Team> teamRosterMap = new LinkedHashMap<String, Team>();

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
        Map<String, Team> teamMap = fileLoader.loadData();
        for (Map.Entry<String, Team> entry : teamMap.entrySet()) {
            this.teamRosterMap.put(entry.getKey(), entry.getValue());
        }
    }

    
    //sorts driver by driver number as key
    public Map<String, Team> getTeamRoster() {
    	return teamRosterMap;
    }
}