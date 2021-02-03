package com.company.Exception;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            findClass();
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
        }
    }

    public static void findClass() throws ClassNotFoundException {
        // findClass를 호출한 곳으로 예외를 던져버려 거기서 예외 처리를 한다.
        Class clazz = Class.forName("java.lang.String2");
    }
}
