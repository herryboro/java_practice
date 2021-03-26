package com.company.stream.mapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MapExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 10),
				new Student("이순신", 20),
				new Student("강감찬", 30)
		);
		
		int sum = studentList.stream().mapToInt(n -> n.getScore()).sum()/3;
		System.out.println(sum);
		int a = 0 % 2;
		System.out.println(a);
	}

}
