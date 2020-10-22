package practice18;

public class InnerClassPractice {
	int number;
	String text;
	
	public InnerClassPractice() {
		Inner in = new Inner();
	}
	
	class Inner{
		int number;
		String text;
	}
	
	public static void main(String[] args) {
		InnerClassPractice.Inner in = new InnerClassPractice().new Inner();
	}
}
