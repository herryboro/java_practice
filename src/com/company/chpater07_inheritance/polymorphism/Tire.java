package com.company.chpater07_inheritance.polymorphism;

public class Tire {
    public int maxRotation;
    public int accumulatedRotation;
    public String location;

    public Tire(int maxRotation, String location) {
        this.maxRotation = maxRotation;
        this.location = location;
    }

    public boolean roll() {
        ++accumulatedRotation;
        System.out.println("accumulatedRotation증가량: " + accumulatedRotation);
        if (accumulatedRotation < maxRotation) {
            System.out.println(location + " tile 수명: " + (maxRotation-accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + " Tire 펑크 ***");
            return false;
        }
    }
}
