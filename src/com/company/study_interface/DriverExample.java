package study_interface;

public class DriverExample {

	public static void main(String[] args) {
		Person person = new Person();		
		Train train = new Train();
		Bike bike = new Bike();
		
		person.drive(train);
		person.drive2(bike);
		
	}

}


