package practice15;

import java.util.ArrayList;

public class Collection {
	private ArrayList<Fruit> fruitBox;
	
	public Collection() {
		fruitBox = new ArrayList<Fruit>();
	}
	
	public void addFruit(Fruit fruit) {
		for(Fruit ele : fruitBox) {
			if(ele.id == fruit.id) {
				System.out.println("���� ��ȣ '"+ele.id+"'��/�� �̹� �����ϴ� �����Դϴ�.");
				return;
			}
		}
		fruitBox.add(fruit);
	}
	
	public void removeFruit(int num) {
		for(Fruit ele : fruitBox) {
			if(ele.id == num) {
				fruitBox.remove(ele);
				return;
			}
		}
		System.out.println("�������� �ʴ� ���� �����Դϴ�.");
		return;
	}
	
	public void showAllFruit() {
		for(Fruit ele : fruitBox) {
			System.out.println(ele.toString());
		}
	}
	
	
}
