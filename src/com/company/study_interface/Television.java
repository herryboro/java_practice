package study_interface;

public class Television implements RemoteController {
	// 필드
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
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
	
}
