package practice14;

public class Test {

	public static void main(String[] args) {
		Box<Apple> box0 = new Box<>();
		Box<Bycicle> box1 = new Box<>();
		Box<Computer> box2 = new Box<>();
		
		Apple apple = new Apple();
		apple.name = "Busa";
		Computer computer = new Computer();
		computer.name = "Apple";
		
		box0.setContent(apple);
		box2.setContent(computer);
		
		System.out.println(box0.getContent().toString());
		System.out.println(box2.getContent().toString());
		
	}

}
