package study_interface;

public class RemoteControllerExample {

	public static void main(String[] args) {
		RemoteController rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);			
	}
}
