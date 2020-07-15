package com.sideproject;

public class Team {
    private String driverNumber;
    private String driverName;
    private String driverPoints;
    private String constructorName;
    private String constructorPoints;

    //constructor
    public Team(String driverNumber, String driverName, String driverPoints, String constructorName, String constructorPoints) {
        this.driverNumber = driverNumber;
        this.driverName = driverName;
        this.driverPoints = driverPoints;
        this.constructorName = constructorName;
        this.constructorPoints = constructorPoints;
    }

    public String getDriverNumber() {
        return this.driverNumber;
    }

    public String getDriverName() {
        return this.driverName;
    }

    public String getDriverPoints() {
        return this.driverPoints;
    }

    public String getConstructorName() {
        return this.constructorName;
    }

    public String getConstructorPoints() {
        return this.constructorPoints;
    }
    
    public String addPointsToDriver(int driverPoints) {
    	Integer driverPointsInt = Integer.parseInt(this.driverPoints);
    	if (driverPoints <= 25) {
    		driverPointsInt += driverPoints;
    	} 
    	this.driverPoints = driverPointsInt.toString();    	
    	return this.driverPoints;
    }
    
    public String addPointToConstructor(int driverPoints) {
    	Integer driverPointsInt = Integer.parseInt(this.constructorPoints);
    	if (driverPoints <= 25) {
    		driverPointsInt += driverPoints;
    	} 
    	this.constructorPoints = driverPointsInt.toString();    	
    	return this.constructorPoints;
    }
}