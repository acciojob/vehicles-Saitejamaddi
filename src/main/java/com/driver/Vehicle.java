package com.driver;

public class Vehicle {

    protected int currentSpeed;
    protected int currentDirection;
    private String name;

    public Vehicle() {}

    public Vehicle(String name) {
        this.name = name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void steer(int direction) {
        currentDirection += direction;
    }

    public void move(int speed, int direction) {
        currentSpeed = speed;
        currentDirection = direction;
    }

    public void stop() {
        currentSpeed = 0;
    }
}
