package com.company.chpater07_inheritance.practice.prac5;

public class Child extends Parent {
    private int studentNo;

//    public Child(String name, int studentNo) {
//        this.name = name;
//        this.studentNo = studentNo;
//    }

    public Child(String name, int studentNo) {
        super(name);
        this.name = name;
        this.studentNo = studentNo;
    }
}
