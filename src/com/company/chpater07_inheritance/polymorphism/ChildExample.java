package com.company.chpater07_inheritance.polymorphism;

public class ChildExample {

    public static void main(String[] args) {
        Parent parent = new Child();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        /*
        parent.field12 = "data2";
        parent.method3();
         */

        Child child = (Child) parent;       // 자식 타입이 부모타입으로 자동 형변환 된 경우에만 다시 자식 타입으로 강제 타입 변환을 할 수 있다.
        child.field2 = "data2";
        child.method3();

        Parent parent2 = new Parent();      // 부모 클래스 생성자를 바로 자식 클래스로 강제 형변환시 ClassCastException이 발생함을 알 수 있다.
        Child child2 = (Child) parent2;
        child2.field2 = "data3";
        child2.method3();
    }
}
