package practice14;

public class Coordinate <T, V> {
	private T x_value;
	private V y_value;
	
	
	public Coordinate(T num, V num2) {
		this.x_value = num;
		this.y_value = num2;
	}
	
	
	public T getX_value() {
		return x_value;
	}
	public void setX_value(T x_value) {
		this.x_value = x_value;
	}
	public V getY_value() {
		return y_value;
	}
	public void setY_value(V y_value) {
		this.y_value = y_value;
	}
	
}
