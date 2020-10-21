package practice17;

import java.util.*;

public class Box<T> {
	HashSet<T> appleBox = new HashSet();
	
	public void add(T ele) {
		appleBox.add(ele);
	}
	
	public void remove(int serial) {
		Iterator<T> temp = appleBox.iterator();
		while(temp.hasNext()) {
			T check = temp.next();
			int check_ser = check.hashCode();
			if(serial == check_ser) {
				appleBox.remove(check);
				return;
			}
		}
		System.out.println("해당 시리얼을 가진 객체가 존재하지 않습니다.");
	}
	
	public void showAll() {
		Iterator<T> temp = appleBox.iterator();
		while(temp.hasNext()) {
			T ele = temp.next();
			System.out.println(ele.toString());
		}
		System.out.println("이상입니다.");
	}
}
