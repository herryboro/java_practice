package com.company.study_interface.contain_default_method;

public class TestClass implements ParentInterface {
	
	@Override
	public void method1() {
		System.out.println("ParentInface의 method1입니다.");
	}
	
	@Override
	public void method2() {
		System.out.println("override한 method2 입니다.");
	}
}
