package com.company.study_interface;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		myCar.frontRightTire = new KumhoTire();
		myCar.frontLeftTire = new KumhoTire();
		myCar.run();
	}

}
