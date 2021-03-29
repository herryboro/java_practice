package com.company.study_interface;

public class Car {
	Tire frontRightTire = new HankookTire();
	Tire frontLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backRightTire.roll();
		backLeftTire.roll();
	}
}
