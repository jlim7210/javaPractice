package practice8;

public class Test_Car {

	public static void main(String[] args) {
		Car car0 = new Car();
		Sedan car1 = new Sedan();
		Truck car2 = new Truck();
		
		System.out.println(car0.move());
		System.out.println(car1.move());
		System.out.println(car2.move());
		
	}

}
