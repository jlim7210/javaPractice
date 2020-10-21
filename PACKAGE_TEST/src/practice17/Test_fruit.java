package practice17;

public class Test_fruit {

	public static void main(String[] args) {
		Box box = new Box();
		
		Apple a1 = new Apple(1000, 1021);
		Apple a2 = new Apple(1001, 1022);
		Apple a3 = new Apple(1002, 1022);
		Apple a4 = new Apple(1002, 1024); //날짜는 다르지만 시리얼이 같아서 add가 안됨.
		
		box.add(a1);
		box.add(a2);
		box.add(a3);
		box.add(a4);
		
		box.showAll();
		
		box.remove(1000);
		box.showAll();
		
//		box.remove(2000);
	}

}
