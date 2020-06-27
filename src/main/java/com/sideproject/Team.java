package com.sideproject;

public class Team {
    private String driverNumber;
    private String driverName;
    private int driverPoints;
    private String constructorName;
    private int constructorPoints;

    //constructor
    public Team(String driverNumber, String driverName, int driverPoints, String constructorName, int constructorPoints) {
        this.driverNumber = driverNumber;
        this.driverName = driverName;
        this.driverPoints = driverPoints;
        this.constructorName = constructorName;
        this.constructorPoints = constructorPoints;
    }

    public String getDriverNumber() {
        return this.driverNumber;
    }

    public void setDriverNumber(String driverNumber) {
        this.driverNumber = driverNumber;
    }

    public String getDriverName() {
        return this.driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public int getDriverPoints() {
        return this.driverPoints;
    }

    public void setDriverPoints(int driverPoints) {
        this.driverPoints = driverPoints;
    }

    public String getConstructorName() {
        return this.constructorName;
    }

    public void setConstructorName(String constructorName) {
        this.constructorName = constructorName;
    }

    public int getConstructorPoints() {
        return this.constructorPoints;
    }

    public void setConstructorPoints(int constructorPoints) {
        this.constructorPoints = constructorPoints;
    }

}