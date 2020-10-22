package practice18;

import java.util.ArrayList;

public class Test_lambda {

	public static void main(String[] args) {
		ArrayList array = new ArrayList();
		array.add(1);
		array.add(1);
		
		//how to use lambda
		//1. make an interface.
		//2. make an abstract method.
		//3. declare the interface and make a lambda expression (= overriding).
		//4. use the abstract method.
		ArrU a1 = ar -> ar.size();
		
		System.out.println(a1.get_size(array));
	}
	
	public String myWorld(ArrayList ha) {
		ArrU a = b -> b.size();
		return a.get_size(ha) + " elements contained.";
	}

}
