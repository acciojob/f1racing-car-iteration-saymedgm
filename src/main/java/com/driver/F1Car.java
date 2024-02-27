package com.driver;

public class F1Car {
    private String carName;
    private double speed;
    private int racesWon;

    public F1Car(String carName, double speed, int racesWon) {
        this.carName = carName;
        this.speed = speed;
        this.racesWon = racesWon;
    }

    public String getCarName() {
        return carName;
    }

    public double getSpeed() {
        return speed;
    }

    public int getRacesWon() {
        return racesWon;
    }
}