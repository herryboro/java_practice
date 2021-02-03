package com.company.Exception;

public class NumberFormatException {
    public static void main(String[] args) {
        String data1 = "100";
        String data2 = "a100";

        int value1 = Integer.parseInt(data1);
        // int로 변환할수 없는 문자를 Integer.ParseInt로 변환 시도한 경우 => NumberFormatException 발생
        int value2 = Integer.parseInt(data2);
        System.out.println(value1);
        System.out.println(value2);
    }
}
