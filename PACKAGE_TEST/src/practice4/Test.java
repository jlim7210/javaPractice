package practice4;

public class Test {
	public static void main(String[] args) {
		Man Joon = new Man(1);
		Elevator ele = new Elevator(9);

		Joon.bringElevator(ele);
		ele.goTo(8);
		
		System.out.println(Joon.floor.number);
	}
}
