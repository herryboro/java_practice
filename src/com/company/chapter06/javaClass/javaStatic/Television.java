package com.company.chapter06.javaClass.javaStatic;

public class Television {

    static String company = "Samsung";
    static String model = "LCD";
    static String info;

    /*
        정적 초기화 블록
        - 생성자로 초기화 할 수 없다
        - static 블록을 생성해서 블록안에서 초기화 해준다.
     */
    static {
        info = company + "-" + model;
    }
}
