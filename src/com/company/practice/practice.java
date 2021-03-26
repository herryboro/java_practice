package com.company.practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class practice {
    public static void main(String[] args) {
        List list = IntStream.range(0, 10).mapToObj(i -> new SampleVO(i, i + " First", i + " Last"))
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
