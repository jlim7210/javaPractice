package practice;

public class TestCar {
	public static void main(String[] args) {
		Car car = new Car();
		car.setName("BMW");
		
		Wheel wheel = new Wheel();
		wheel.setCount(4);
		wheel.setSize(20);
		
		car.setRoller(wheel);
		
		System.out.println(car.getName());
		System.out.println(car.getRoller().getCount());
		System.out.println(car.getRoller().getSize());
	}
}
