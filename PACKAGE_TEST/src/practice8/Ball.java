package practice8;
import java.util.ArrayList;

public class Ball {
	protected int size;
	protected String color;
	protected ArrayList<String> brands = new ArrayList<String>();
	
	public Ball() {}
	public Ball(int size, String color) {
		this.size = size;
		this.color = color;
	}
}
