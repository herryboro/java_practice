package com.company.chpater07_inheritance.call_parentConstructure;

public class Student extends People {
    public int studentNo;

    public Student(String name, String ssn, int studentNo) {
        super(name, ssn);   // 부모클래스의 생성자를 호출해준다.
        this.studentNo = studentNo;
    }
}
