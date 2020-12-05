package com.company.anonymousclass;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anonymous = new Anonymous();
		anonymous.field.wake();
		
		System.out.println("===================");
		
		anonymous.method1();
		
		System.out.println("===================");
		
		anonymous.method2(
		    new Person() {
		    	void study() {
		    		System.out.println("공부합니다.");
		    	}
		    	
		    	void wake() {
		    		System.out.println("8시에 일어납니다.");
		    		study();
		    	}
		    }	// 메서드의 매개변수로 익명내부클래스 만들경우 ; 안쓰는지 확인점?
		);
		
	}
}
