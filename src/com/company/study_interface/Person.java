package study_interface;

public class Person {
	public void drive(Train train) {
		System.out.println("사람이 " + train.trainRide());				
	}
	
	public void drive2(Bike bike) {
		System.out.println("사람이 " + bike.bikeRide());				
	}
}



