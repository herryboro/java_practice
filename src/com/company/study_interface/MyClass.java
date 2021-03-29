package com.company.study_interface;

public class MyClass {
	// 필드
	RemoteController rc = new Television();
	
	// 생성자
	MyClass(RemoteController rc) {
		this.rc = rc;
	}
	
	// 메소드
	void method() {
		// 로컬변수
		RemoteController rc = new Audio();
	}
	void methodB(RemoteController rc) {}
}
