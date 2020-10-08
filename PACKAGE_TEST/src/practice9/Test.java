package practice9;

public class Test {

	public static void main(String[] args) {
		System.out.println(check_sweet(new Apple()));
		System.out.println(check_sweet(new Grape()));
		System.out.println(check_sweet(new Orange()));
	}

	public static int check_sweet(Fruit fruit) {
		return fruit.sweet;
	}
}
