package practice15;

public class Test {

	public static void main(String[] args) {
		Collection fruitBox = new Collection();
		Apple a1 = new Apple(1000, "대구");
		Apple a2 = new Apple(1001, "대구");
		Apple a3 = new Apple(1002, "청주");
		Orange o1 = new Orange(2000, "미국");
		Orange o2 = new Orange(2000, "미국"); //아이디가 o1과 같아 리스트 add 불가능
		Orange o3 = new Orange(2001, "호주");
		
		fruitBox.addFruit(a1);
		fruitBox.addFruit(a2);
		fruitBox.addFruit(a3);
		fruitBox.addFruit(o1);
		fruitBox.addFruit(o2);
		fruitBox.addFruit(o3);
		
		fruitBox.showAllFruit();
		
		System.out.println();
		System.out.println();
		System.out.println("사과를 지워보겠습니다.");
		System.out.println();
		System.out.println();
		
		fruitBox.removeFruit(1000);
		fruitBox.removeFruit(1001);
		fruitBox.removeFruit(1002);
		
		fruitBox.showAllFruit();
	}

}
