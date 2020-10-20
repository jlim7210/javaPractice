package practice16;

public class Button {
	public static int point = 0;
	int level = 10;
	
	public void pointUp() {
		point++;
	}
	
	public void pointDown() {
		point--;
	}
	
	public void showPoint() {
		System.out.println(point);
	}
}
