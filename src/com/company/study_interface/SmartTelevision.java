package com.company.study_interface;

public class SmartTelevision implements RemoteController, Searchable {
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteController.max_volume) {
			this.volume = RemoteController.max_volume;
		} else if(volume < RemoteController.min_volume) {
			this.volume = RemoteController.min_volume;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
	
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
	
}
