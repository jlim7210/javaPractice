package practice18;

import java.util.ArrayList;

public class Test_lambda2 {

	public static void main(String[] args) {
		//1번문제
		ArrayList<Integer> arr = new ArrayList();
		for(int i=1; i<=100; i++) {
			arr.add(i);
		}
		System.out.println(arr.stream().filter(e -> e>=50).filter(e -> e%2==0).mapToInt(e -> e).sum());
		
		
		//2번문제
		Product p1 = new Product(10000, "toy_car");
		Product p2 = new Product(5000, "note");
		Product p3 = new Product(2000, "pen");
		Product p4 = new Product(30000, "toy_gun");
		
		ArrayList<Product> store = new ArrayList();
		store.add(p1);
		store.add(p2);
		store.add(p3);
		store.add(p4);
		
		store.stream().filter(e -> e.price >= 5000).map(e -> e.name).sorted().forEach(e -> System.out.println(e));
	}

}
