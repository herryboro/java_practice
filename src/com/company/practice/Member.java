package com.company.practice;

public class Member implements Car {
    @Override
    public void bus() {
        System.out.println("버스를 탑니다.");
    }

    @Override
    public void metro() {
        System.out.println("지하철을 탑니다.");
    }

    public void taxi() {
        System.out.println("택시를 탑니다.");
    }
}
