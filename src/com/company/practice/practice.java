package com.company.practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class practice {
    public static void main(String[] args) {
       String fileName = "2020-05-14-18-59-47-466.jpg";
       int num = fileName.lastIndexOf("\\");
       System.out.println(num);
    }
}
