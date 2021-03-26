package com.company.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		System.out.println("startTime1: " + startTime);
		for(int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("endTime1: " + endTime);
		System.out.println("ArrayList 걸리는 시간: " + (endTime - startTime) + " ns");
		
		startTime = System.nanoTime();
		System.out.println("startTime2: " + startTime);
		for(int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("endTime2: " + endTime);
		System.out.println("LinkedList 걸리는 시간: " + (endTime + startTime) + " ns");
	}

}
