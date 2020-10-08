package practice3;

public class test {
	public static void main(String[] args) {
		student std = new student("Lim", 5000);
		Bus bus = new Bus(9999);
		std.takeBus(bus);
		
		System.out.println(std.money);
		
		Human human = new Human();
		Apple apple = new Apple(5);
		human.eatApple(apple);
		System.out.println(apple.appleCount);
		
	}
}
