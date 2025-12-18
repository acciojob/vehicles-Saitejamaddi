package com.driver;

public class F1 extends Car {

    // Required for TEST CASES
    public F1() {
        this("F1", false);
    }

    // Required for Main.java (problem statement)
    public F1(String name, boolean isManual) {
        super(2, 6, 4, isManual, "F1", 1);
        setName(name);
    }

    // Required for TEST CASES
    public void accelerate() {
        currentSpeed += 10;
    }

    // Required for Main.java
    public void accelerate(int rate) {
        currentSpeed += rate;
        if (currentSpeed < 0) {
            currentSpeed = 0;
        }
    }

    // Required for TEST CASES
    public void brake() {
        currentSpeed -= 5;
        if (currentSpeed < 0) {
            currentSpeed = 0;
        }
    }
}
