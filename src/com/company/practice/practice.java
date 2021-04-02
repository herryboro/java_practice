package com.company.practice;

public class practice {
    public static void main(String[] args) {
        int total = 106;
        System.out.println((total * 1.0 / 10));
        System.out.println("endPage: " +Math.ceil((total * 1.0 / 10) / 10) * 10);
        double realPage = Math.ceil(total * 1.0 / 10);
        System.out.println("realPage: " + realPage);
    }
}
