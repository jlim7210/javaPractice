package practice8;

public class BaseballBall extends Ball {
	public BaseballBall(int size, String color) {
//		super.size = size;
//		super.color = color;
		super(size, color);
		super.brands.add("FILA");
		super.brands.add("NIKE");
	}
}
