package practice7;
import java.util.ArrayList;

public class ArrayL {
	public static void main(String[] args) {
		ArrayList<Apple> appleBox = new ArrayList<Apple>();
		
		for(int i=0; i<100; i++) {
			appleBox.add(new Apple());
		}
		System.out.println("end");
	}
}