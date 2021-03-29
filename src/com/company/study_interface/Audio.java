package com.company.study_interface;

public class Audio implements RemoteController {
	// 필드
	private int volume;
	private boolean mute;

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	// setVolume() 추상 메소드의 실체 메소드
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteController.max_volume) {
			this.volume = RemoteController.max_volume;
		} else if(volume < RemoteController.min_volume) {
			this.volume = RemoteController.min_volume;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}

	@Override
	public void setMute(boolean mute) {	
		this.mute = mute;
		if(mute) {
			System.out.println("Audio를 무음 처리합니다.");
		} else {
			System.out.println("Audio 무음 해제합니다.");
		}
	}
	
	
	
	
}
