package com.driver;

public class F1 extends Car {

    public F1() {
        super(2, 6, 4, false, "F1", 1);
    }

    public void accelerate() {
        currentSpeed += 10;
    }

    public void brake() {
        currentSpeed -= 5;
        if (currentSpeed < 0) {
            currentSpeed = 0;
        }
    }
}
