package com.company.anonymousclass.anonycreate;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.turnOn();
		System.out.println("=================");
		
		anony.method1();
		System.out.println("=================");
		
		anony.method2(
			new RemoteControl() {
				
				@Override
				public void turnOn() {
					System.out.println("Samsong TV를 켭니다.");
				}
				
				@Override
				public void turnOff() {
					System.out.println("Samsong TV를 끕니다.");
				}
			}
		);	
	}

}
