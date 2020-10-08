package practice8;

public class BasketballBall extends Ball {
	public BasketballBall(int size, String color) {
//		super.size = size;
//		super.color = color;
		super(size, color);
		super.brands.add("ADIDAS");
		super.brands.add("ASICS");
	}
}
