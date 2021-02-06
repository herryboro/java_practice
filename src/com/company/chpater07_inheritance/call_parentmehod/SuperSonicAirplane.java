package com.company.chpater07_inheritance.call_parentmehod;

public class SuperSonicAirplane extends AirPlane {
    public static int NORMAL = 1;
    public static int SUPERSONIC = 2;

    public int flyMode = NORMAL;

    @Override
    public void fly() {
        if (flyMode == SUPERSONIC) {
            System.out.println("초음속 비행합니다.");
        } else {
            super.fly();
        }
    }
}
