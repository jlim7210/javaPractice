package com.samsung.elec;

public class Test {
	public static void main(String[] args) {
		Apple red_apple = new Apple();
		Apple green_apple = new Apple();
		
//		red_apple.set_color("red"); //Ŭ���� �޼ҵ带 �̿��� �÷��� �����ϴ� ���
		red_apple.color = "red"; //Ŭ���� ��������� ���� �÷��� �����ϴ� ���
		green_apple.set_color("green");
		
//		System.out.println(red_apple.get_color()); //Ŭ���� �޼ҵ带 �̿��� ���
		System.out.println(red_apple.color); //Ŭ���� ��������� ���
		System.out.println(green_apple.get_color());
	}
}
