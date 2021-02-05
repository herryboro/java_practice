package com.company.chapter06.javaClass.javaStatic;

public class CalculatorExample {
    // 객체마다 가지고 있을 필요가 없는 변하지 않는 고용적인 데이터들은 정적(static) 필드,메서드 등으로 선언 하는것이 좋다.

    public static void main(String[] args) {
        double result1 = 10 * 10 * Calculator.pi;
        int result2 = Calculator.plus(10, 5);
        int result3 = Calculator.minus(10, 5);

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);
    }
}
