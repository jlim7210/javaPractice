package practice18;

public class A {
	void test() {
		try {
			new B().test();
		} catch (NullPointerException e) {
			System.out.println("exception caught");
		}
		System.out.println("I am A test");
	}
}
