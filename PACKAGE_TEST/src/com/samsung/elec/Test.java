package com.samsung.elec;

public class Test {
	public static void main(String[] args) {
		Apple red_apple = new Apple();
		Apple green_apple = new Apple();
		
//		red_apple.set_color("red"); //클래스 메소드를 이용해 컬러를 지정하는 방법
		red_apple.color = "red"; //클래스 멤버변수를 통해 컬러를 지정하는 방법
		green_apple.set_color("green");
		
//		System.out.println(red_apple.get_color()); //클래스 메소드를 이용해 출력
		System.out.println(red_apple.color); //클래스 멤버변수를 출력
		System.out.println(green_apple.get_color());
	}
}
