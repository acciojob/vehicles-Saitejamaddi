package com.driver;

public class Car extends Vehicle {

    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(int doors, int gears, int wheels, boolean isManual, String type, int seats) {
        this.doors = doors;
        this.gears = gears;
        this.wheels = wheels;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;
        this.currentSpeed = 0;
    }

    public int getWheels() {
        return wheels;
    }

    public String getType() {
        return type;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getSeats() {
        return seats;
    }

    public void changeGear(int newGear){
        this.currentGear = newGear;
        System.out.println(
                "changeGear method called - The gear is changed to: " + currentGear
        );
    }

    public void changeSpeed(int newSpeed, int newDirection){
        this.currentSpeed = newSpeed;
        this.currentDirection = newDirection;
        System.out.println(
                "changeSpeed method called - The speed is changed to: "
                        + newSpeed + ", and the direction is changed to: "
                        + newDirection + " degrees"
        );
    }
}
