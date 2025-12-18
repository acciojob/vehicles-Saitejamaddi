package com.driver;

public class F1 extends Car {

    public F1() {
        this("F1", false);
    }

    public F1(String name, boolean isManual) {
        super(2, 6, 4, isManual, "F1", 1);
        setName(name);
    }

    // Required by TEST CASES
    public void accelerate() {
        applyAcceleration(10);
    }

    // Required by PROBLEM STATEMENT
    public void accelerate(int rate) {
        applyAcceleration(rate);
    }

    private void applyAcceleration(int rate) {
        int newSpeed = currentSpeed + rate;

        if (newSpeed < 0) {
            newSpeed = 0;
        }

        currentSpeed = newSpeed;

        if (currentSpeed <= 50) {
            changeGear(1);
        } else if (currentSpeed <= 100) {
            changeGear(2);
        } else if (currentSpeed <= 150) {
            changeGear(3);
        } else if (currentSpeed <= 200) {
            changeGear(4);
        } else if (currentSpeed <= 250) {
            changeGear(5);
        } else {
            changeGear(6);
        }
    }

    public void brake() {
        currentSpeed -= 5;
        if (currentSpeed < 0) {
            currentSpeed = 0;
        }
    }
}
