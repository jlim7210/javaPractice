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
				System.out.println("과일 번호 '"+ele.id+"'은/는 이미 존재하는 과일입니다.");
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
		System.out.println("존재하지 않는 과일 정보입니다.");
		return;
	}
	
	public void showAllFruit() {
		for(Fruit ele : fruitBox) {
			System.out.println(ele.toString());
		}
	}
	
	
}
