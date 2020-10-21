package practice17;

public class Test_interface {

	public static void main(String[] args) {
		A a1 = new A();
		A b1 = new B();
		C c1 = new C();
		C d1 = new D();
		Bridge a2 = new A();
		Bridge b2 = new B();
		Bridge b3 = (Bridge)b1;
		
		C c3 = (C)b1;
		C c2 = (C)b2;
		C c4 = (C)b3;
	}

}
