package com.company.study_interface;

public interface RemoteController {
	int max_volume = 10;
	int min_volume = 0;
	
	// 추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// 정적메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
