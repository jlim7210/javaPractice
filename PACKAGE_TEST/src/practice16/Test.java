package practice16;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		String a1 = new String("123");
		String a2 = new String("123");
		String a3 = new String("123");
		String a4 = new String("123");
		
		MyLinkedList list = new MyLinkedList();
		
		list.add(a1);
		list.add(a2);
		list.add(1, a3);
		System.out.println(list.array.get(1));
		System.out.println(a2.hashCode());
		//159259014
	}

}
