package com.company.chapter13_generics.limitedTypeParameter;

public class BoundedTypeParameterExample {
    public static void main(String[] args) {
        // 제한된 타입 파라미터<T extends 상위타입>
        // String str = Util.compare("a", "b");  String은 Number 타입이 아님
        int result1 = Util.compare(10, 20);
        System.out.println(result1);

        int result2 = Util.compare(4.5, 3);
        System.out.println(result2);
    }
}
