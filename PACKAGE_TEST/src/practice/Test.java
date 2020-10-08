package practice;

public class Test {
	public static void main(String[] args) {
		Milk seoul_milk = new Milk();
		seoul_milk.set_price(10000);
		
		
		Coffee latte = new Coffee(seoul_milk);
		Milk namyang_milk = latte.get_milk();
		System.out.println(namyang_milk.get_price());
	}
}
