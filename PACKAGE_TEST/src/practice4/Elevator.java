package practice4;

public class Elevator {
	Floor floor;
	Man passenger;
	
	public Elevator(int num) {
		Floor floor = new Floor();
		floor.number = num;
		this.floor = floor;
	}
	
	void goTo(int num) {
		this.floor.number = num;
		passenger.floor.number = num;
	}
	
//	Floor move(int num) {
//		this.floor.number = num;
//		return this.floor;
//	}  Return a user reference data type(Class)
}
