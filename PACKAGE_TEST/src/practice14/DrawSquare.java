package practice14;

public class DrawSquare {
	
	public static <T, V, A> double size(Coordinate<Double, Float> p1, Coordinate<Double, Integer> p2) {
		double top = Math.abs(((Number)p1.getX_value()).doubleValue() - ((Number)p2.getX_value()).doubleValue());
		double left = Math.abs(((Number)p1.getY_value()).doubleValue() - ((Number)p2.getY_value()).doubleValue());
		
		return (double)top*left;
	}
	
	
	public static void main(String[] args) {
		Coordinate<Double, Float> p1 = new Coordinate(0.0, 0f);
		Coordinate<Double, Integer> p2 = new Coordinate(10.0, 20);
		
		System.out.println(DrawSquare.size(p1, p2));
	}

}
