package com.company.chpater07_inheritance.abstractClass;

public class PhoneExample {
    public static void main(String[] args) {

//        Phone phone = new Phone();    추상 클래스는 new 로 객체 생성을 할 수 없다.

        SmartPhone smartPhone = new SmartPhone("홍길동");      // 추상클래스의 자식 객체를 이용하여 추상클래스의 내용들을 호출 할 수는 있다.
        System.out.println(smartPhone.owner);
        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
