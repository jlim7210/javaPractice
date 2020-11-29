package second;

public class Lambda001 {
	
	public interface calc{
		public int hello(int a, int b);
	}
	
	public static void main(String[] args) {
		
		calc hi = (a, b) -> a + b;
		System.out.println(hi.hello(5, hi.hello(2, 4)));
		
		calc minus = (a, b) -> a - b;
		System.out.println(minus.hello(30, 12));
	}
}
