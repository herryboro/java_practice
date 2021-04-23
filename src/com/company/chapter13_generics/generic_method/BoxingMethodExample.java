package com.company.chapter13_generics.generic_method;

import com.company.chapter13_generics.generic_type.Box;

public class BoxingMethodExample {
    public static void main(String[] args) {
        Box<Integer> box1 = Util.<Integer>boxing(100);
        int intValue = box1.get();
        System.out.println("intValue: " + intValue);

        Box<String> box2 = Util.<String>boxing("홍길동");
        String strValue = box2.get();
        System.out.println("strValue: " + strValue);
    }
}
