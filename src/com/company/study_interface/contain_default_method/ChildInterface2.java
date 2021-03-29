package com.company.study_interface.contain_default_method;

public interface ChildInterface2 extends ParentInterface {
	
	@Override
	public default void method2(){}
	
	public void method3();
}
