package practice3;

public class Human {
	String name;
	int age;
	
	public Human() {
		
	}
	
	public void eatApple(Apple apple) {
		apple.appleCount -= 1;
	}
	
	public void driveCar(Car car) {
		car.oil -= 100;
		car.passenger += 1;
	}
}
