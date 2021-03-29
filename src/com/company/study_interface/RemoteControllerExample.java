package com.company.study_interface;

public class RemoteControllerExample {

	public static void main(String[] args) {
		RemoteController rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);

		// 익명 구현 객체
		/*RemoteController rc = new RemoteController() {
			@Override
			public void turnOn() {

			}

			@Override
			public void turnOff() {

			}

			@Override
			public void setVolume(int volume) {

			}
		};*/

		// 정적 메소드 사용
		RemoteController.changeBattery();	// 구현 객체 없이 바로 사용가능
	}
}
