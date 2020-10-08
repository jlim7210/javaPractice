package practice8;

public class Sedan extends Car {
	
	Sedan(){
		super(50);
		price = 5000;
//		System.out.println("It's a Sedan's constructor." + price);
	}
	
	void CheckPrice() {
		System.out.println(price);
	}
	
	public String move() {
		return "½´·ç·è";
	}
}
