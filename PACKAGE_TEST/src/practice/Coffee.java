package practice;

public class Coffee {
	private String name;
	private int price;
	private Milk milk;
	
	public Coffee(Milk milk) {
		this.milk = milk;
	}
	public Milk get_milk() {
		return milk;
	}
}
