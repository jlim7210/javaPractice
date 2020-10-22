package practice18;

public class Test_exception {

	public static void main(String[] args) {

		try {
				int num = (Integer) null;
				System.out.println(num);
			}catch(NullPointerException a) {
				System.out.println("error: null value detected");
			}
		
		try {
			Object obj1 = new String("123");
			System.out.println((int)obj1);
		}catch(ClassCastException a) {
			System.out.println("error: class cast exception");
		}
	}

}
