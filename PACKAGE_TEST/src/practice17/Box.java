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
		System.out.println("�ش� �ø����� ���� ��ü�� �������� �ʽ��ϴ�.");
	}
	
	public void showAll() {
		Iterator<T> temp = appleBox.iterator();
		while(temp.hasNext()) {
			T ele = temp.next();
			System.out.println(ele.toString());
		}
		System.out.println("�̻��Դϴ�.");
	}
}
