package practice3;

public class Car {
	int oil;
	int passenger;
	
	public Car() {
		this(1000, 0);
	}
	
	public Car(int fuel, int man) {
		this.oil = fuel;
		this.passenger = man;
	}
	
}
