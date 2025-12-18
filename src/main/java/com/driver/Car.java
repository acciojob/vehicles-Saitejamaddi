package com.driver;

public class Car extends Vehicle {

    private int doors;
    private int gears;
    private int wheels;
    private boolean isManual;
    private String type;
    private int seats;
    private int currentGear;

    public Car(int doors, int gears, int wheels, boolean isManual, String type, int seats) {
        this.doors = doors;
        this.gears = gears;
        this.wheels = wheels;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;
        this.currentSpeed = 0;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isManual() {
        return isManual;
    }

    public String getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

    public void changeGear(int newGear) {
        currentGear = newGear;
    }

    public void changeSpeed(int newSpeed, int newDirection) {
        currentSpeed = newSpeed;
        currentDirection = newDirection;
    }
}
