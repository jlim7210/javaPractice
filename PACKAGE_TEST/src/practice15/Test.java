package practice15;

public class Test {

	public static void main(String[] args) {
		Collection fruitBox = new Collection();
		Apple a1 = new Apple(1000, "�뱸");
		Apple a2 = new Apple(1001, "�뱸");
		Apple a3 = new Apple(1002, "û��");
		Orange o1 = new Orange(2000, "�̱�");
		Orange o2 = new Orange(2000, "�̱�"); //���̵� o1�� ���� ����Ʈ add �Ұ���
		Orange o3 = new Orange(2001, "ȣ��");
		
		fruitBox.addFruit(a1);
		fruitBox.addFruit(a2);
		fruitBox.addFruit(a3);
		fruitBox.addFruit(o1);
		fruitBox.addFruit(o2);
		fruitBox.addFruit(o3);
		
		fruitBox.showAllFruit();
		
		System.out.println();
		System.out.println();
		System.out.println("����� �������ڽ��ϴ�.");
		System.out.println();
		System.out.println();
		
		fruitBox.removeFruit(1000);
		fruitBox.removeFruit(1001);
		fruitBox.removeFruit(1002);
		
		fruitBox.showAllFruit();
	}

}
