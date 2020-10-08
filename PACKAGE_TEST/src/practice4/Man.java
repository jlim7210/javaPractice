package practice4;

public class Man {
	Floor floor;
	
	public Man(int num) {
		Floor floor = new Floor();
		floor.number = num;
		this.floor = floor;
	}
	
	void bringElevator(Elevator ele) {
		ele.floor.number = this.floor.number;
		ele.passenger = this;
	}
}
