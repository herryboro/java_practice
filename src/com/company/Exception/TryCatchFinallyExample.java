package com.company.Exception;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("java.lang.String2");
            System.out.println("클래스가 존재합니다.");
        } catch(ClassNotFoundException e) {
            // java.lang.String2 라는 클래스는 존재하지 않기 때문에 catch이 실행됨을 알 수 있다.
            System.out.println("클래스가 존재하지 않습니다.");
        }

    }
}
